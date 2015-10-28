package it.phoenixspa.learn;

public class Example {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) > 18) {
            System.out.println("ok puoi entrare");
        } else {
            System.err.println("non puoi entrare");
        }

    }
}
