package by.epam.training.calculator;

public class Expressions {

    static void calculate (String line){

        String string = line.replaceAll(" ", "");

        char [] ch = string.toCharArray();

        //читалка
        for (char c : ch) {
            System.out.print(c + ", ");
        }

        if(line.isEmpty()){
            nextLine();
        }
        public static void nextLine (String line){

        }


    }
}
