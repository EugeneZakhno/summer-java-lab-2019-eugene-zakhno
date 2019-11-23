package by.epam.training.calculator;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader("./task-3/src/main/resources/input_1.txt"))) {

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
