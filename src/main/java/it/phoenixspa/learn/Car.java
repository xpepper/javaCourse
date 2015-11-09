package it.phoenixspa.learn;

public class Car {
    private static final int _1000 = 1000;
    int engineDisplacement;
    int currentSpeed;

    public static Car createWithStartingSpeed(int startingSpeed) {
        Car car = new Car(_1000);
        car.currentSpeed = startingSpeed;
        return car;
    }

    public static Car createSuv() {
        return new Suv(_1000);
    }

    public Car(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
        this.currentSpeed = 0;
    }

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }

    public Double calcolaBollo() {
        return engineDisplacement * 0.75;
    }

}
