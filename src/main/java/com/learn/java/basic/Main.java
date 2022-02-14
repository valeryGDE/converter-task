package com.learn.java.basic;

import com.learn.java.basic.exception.NumberParserException;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String file1 = "resources/file.txt";
        String file2 = "resources/result.txt";

        NumberReader nReader = null;
        NumberCalculator calculator = null;
        NumberWriter nWriter = null;

        List<Data> fileData = null;

        try {
            nReader = new NumberReader(file1, new NumberParser());
            fileData = nReader.take();

            calculator = new NumberCalculator(fileData);
            fileData = calculator.calc(fileData);
            nWriter = new NumberWriter(file2, fileData);
            boolean b = nWriter.save();


        } catch (NumberParserException e) {
            // log
			e.printStackTrace();
            System.out.println("Error");
        }

    }

}
