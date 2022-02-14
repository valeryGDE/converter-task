package com.learn.java.basic;

import com.learn.java.basic.exception.DataParserException;

import java.util.regex.Pattern;

public class NumberParser {

    private Pattern delimiter = Pattern.compile("\\s");

    public Data parse(String dataFromFile) throws DataParserException {
        Data data = new Data();
        if (!validate(dataFromFile)) {
            throw new DataParserException("Validation exception");
        }
        String[] words = dataFromFile.split(String.valueOf(delimiter));
        data.setNumber1(Double.parseDouble(words[0]));
        data.setNumber2(Double.parseDouble(words[1]));
        switch (words[2]) {
            case "+":
                data.setSign(Sign.PLUS);
                break;
            case "-":
                data.setSign(Sign.MINUS);
                break;
            case "/":
                data.setSign(Sign.DIVIDE);
                break;
            case "*":
                data.setSign(Sign.MULTIPLY);
                break;
            default:
                System.out.println("Bye-bye");
                break;
        }

        return data;
    }

    private boolean validate(String dataFromFile) {
        if (dataFromFile.matches("([0-9]+(\\.[0-9]+)?)\\s([0-9]+(\\.[0-9]+)?)\\s(\\+|-|/|\\*)")) {
            return true;
        } else {
            return false;
        }

    }

}

