package com.learn.java.basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Converter {

    public static void convertToFileWithCalculation(String fileSource, String fileResult) {

        try (
                FileReader fileReader = new FileReader(fileSource);
                FileWriter fileWriter = new FileWriter(fileResult)) {

            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] words = s.split("\\s+");
                char sign = words[2].charAt(0);

                double x = 0;
                switch (sign) {

                    case '+':
                        x = Double.parseDouble(words[0]) + Double.parseDouble(words[1]);
                        break;
                    case '-':
                        x = Double.parseDouble(words[0]) - Double.parseDouble(words[1]);
                        break;
                    case '/':
                        if (Double.parseDouble(words[1]) == 0) {
                            System.out.println("Деление на ноль недопустимо");
                            break;
                        } else {
                            x = Double.parseDouble(words[0]) / Double.parseDouble(words[1]);
                        }
                        break;
                    case '*':
                        x = Double.parseDouble(words[0]) * Double.parseDouble(words[1]);
                        break;
                    default:
                        System.out.println("Bye-bye");
                        break;
                }
                String s1 = (words[0] + sign + words[1] + "=" + x);
                fileWriter.write(s1 + "\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Please check files");
        }
    }
}
