package it.phoenixspa.learn;

public class ArraySample {
    public static void main(String[] args) {
        int numbers[];
        numbers = new int[2];
        numbers[0] = 5;
        numbers[1] = 10;

        int[] moreNumbers = { 5, 10, 15 };
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.println(moreNumbers[i]);
        }
        Car[] automobili;
        automobili = new Car[2];
        automobili[0] = new Suv(1000);
        automobili[1] = new Suv(1000);
        for (int i = moreNumbers.length - 1; i >= 0; i--) {
            automobili[i].currentSpeed = 10 * i;
        }

        Car[] cars;
        cars = new Car[2];
        cars[0] = new Suv(1000);
        cars[1] = new Taxi(1000, "2013ABC123");
        for (int i = 0; i < cars.length; i++) {
            cars[i].currentSpeed = 10 * i;
            if (cars[i] instanceof Taxi) {
                ((Taxi) cars[i]).license = "WER67YT";
            }
        }

        for (Car car : cars) {
            car.currentSpeed = 21;
        }

    }
}
