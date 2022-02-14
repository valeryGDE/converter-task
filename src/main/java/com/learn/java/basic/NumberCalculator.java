package com.learn.java.basic;

import java.util.List;

public class NumberCalculator {

    private List<Data> list;

    public NumberCalculator() {
    }

    public NumberCalculator(List<Data> list) {
        this.list = list;
    }

    public List<Data> getList() {
        return list;
    }

    public void setList(List<Data> list) {
        this.list = list;
    }

    public List<Data> calc(List<Data> list) {
        for (Data data : list) {
            switch (data.getSign()) {

                case PLUS:
                    data.setResult(data.getNumber1().doubleValue() + data.getNumber2().doubleValue());
                    break;
                case MINUS:
                    data.setResult(data.getNumber1().doubleValue() - data.getNumber2().doubleValue());
                    break;
                case DIVIDE:
                    if (data.getNumber2().doubleValue() == 0) {
                        System.out.println("Деление на ноль недопустимо");
                        break;
                    } else {
                        data.setResult(data.getNumber1().doubleValue() / data.getNumber2().doubleValue());
                    }
                    break;
                case MULTIPLY:
                    data.setResult(data.getNumber1().doubleValue() * data.getNumber2().doubleValue());
                    break;
                default:
                    System.out.println("Bye-bye");
                    break;
            }

        }
        return list;
    }

}
