package by.epam.training.calculator;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                Expressions.calculate(reader.readLine());
            }







            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
