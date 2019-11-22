package by.epam.training;


public class Calculator {

    double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean calc(int charToCalc) {
                while (ch == ' ') nextChar();
                if (ch == charToCalc) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (calc('+')) x += parseTerm();
                    else if (calc('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (calc('*'))
                        x *= parseFactor();
                    else if (calc('/')) {
                        x /= parseFactor();
                    }
                    else return x;
                }
            }

            double parseFactor() {

                if (calc('+')) return parseFactor();
                if (calc('-')) return -parseFactor();
                double x;
                int startPos = this.pos;
                if (calc('(')) {
                    x = parseExpression();
                    calc(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if ("sqrt".equals(func)) {
                        x = Math.sqrt(x);
                    } else if ("sin".equals(func)) {
                        x = Math.sin(Math.toRadians(x));
                    } else if ("cos".equals(func)) {
                        x = Math.cos(Math.toRadians(x));
                    } else if ("tan".equals(func)) {
                        x = Math.tan(Math.toRadians(x));
                    } else {
                        throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (calc('^')) x = Math.pow(x, parseFactor());
                if (calc('%')) x = x * (parseFactor() / 100);
                return x;
            }
        }.parse();
    }
}