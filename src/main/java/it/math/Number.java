package it.math;

public class Number {

    private static int value;

    public Number(int v) {
        value = v;
    }

    public static Long longValue() {
        return new Long(value);
    }
}

class NumberExamples {
    public static void main(String[] args) {
        Number number = new Number(123);
        number.longValue();

        Number.longValue();
    }
}
