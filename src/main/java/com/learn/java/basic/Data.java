package com.learn.java.basic;

import java.util.Objects;

public class Data {

    private Number number1;
    private Number number2;
    private Sign sign;

    private Number result;

    public Data() {
    }

    public Data(Number number1, Number number2, Sign sign) {
        this.number1 = number1;
        this.number2 = number2;
        this.sign = sign;
    }

    public Number getNumber1() {
        return number1;
    }

    public void setNumber1(Number number1) {
        this.number1 = number1;
    }

    public Number getNumber2() {
        return number2;
    }

    public void setNumber2(Number number2) {
        this.number2 = number2;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(number1, data.number1) && Objects.equals(number2, data.number2) && sign == data.sign && Objects.equals(result, data.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2, sign, result);
    }

    @Override
    public String toString() {
        return "Data{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", sign=" + sign +
                ", result=" + result +
                '}';
    }
}
