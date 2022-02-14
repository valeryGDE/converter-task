package com.learn.java.basic;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberWriter {
    private String path;
    private List<Data> list;

    public NumberWriter(String path, List<Data> list) {
        this.path = path;
        this.list = list;
    }

    public boolean save() {
        FileWriter writer = null;
        List<Data> result = new ArrayList<Data>();

        try {
            writer = new FileWriter(path);
            for (Data data : list) {
                writer.write(format(data));
                writer.flush();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
            System.out.println("Please check files");
        }
        return true;
    }

    private String format(Data data) {
        String sign = "";
        switch (data.getSign()) {

            case PLUS:
                sign = "+";
                break;
            case MINUS:
                sign = "-";
                break;
            case DIVIDE:
                sign = "/";
                break;
            case MULTIPLY:
                sign = "*";
                break;
            default:
                System.out.println("Bye-bye");
                break;
        }

        String s = new StringBuilder().append(data.getNumber1()).append(sign).append(data.getNumber2()).append("=").append(data.getResult()).append("\n").toString();
        return s;
    }
}
