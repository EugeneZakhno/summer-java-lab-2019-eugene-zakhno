package by.epam.training;

import java.io.*;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {

        String line;
        String expression;
        Calculator calculator = new Calculator();

        try (BufferedReader reader = new BufferedReader(new FileReader("./task-3/src/main/resources/input_1.txt"))) {
            while ((line = reader.readLine()) != null) {

                expression = line.replaceAll(" ", "");
                double result = calculator.eval(expression);

                if (Pattern.matches("(Infinity)", Double.toString(result))) {
                    System.out.println("Division by zero");
                } else {
                    if (result == (long) result) {
                        System.out.printf("%s=%d\n", expression, (long) result);
                    } else {
                        System.out.printf("%s=%.5f\n", expression, result);
                    }
                }

                PrintWriter printWriter = new PrintWriter(new FileWriter("./task-3/src/main/resources/output_1.txt", true));
                if (Pattern.matches("(Infinity)", Double.toString(result))) {
                    printWriter.println("Division by zero");
                } else {
                    if (result == (long) result)
                        printWriter.printf("%s=%d\n", expression, (long) result);
                    else {
                        printWriter.printf("%s=%.5f\n", expression, result);
                    }
                }
                printWriter.flush();
                printWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
