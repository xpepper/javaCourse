package it.phoenixspa.learn;

public abstract class Car {
    private static final int DEFAULT_ENGINE_DISPLACEMENT = 1000;
    private static double BASIC_BOLLO_TAX_RATE = 0.75;

    int engineDisplacement;
    int currentSpeed;

    public Car() {
        this(DEFAULT_ENGINE_DISPLACEMENT);
    }

    public Car(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public abstract String librettoDiCircolazione();

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }

    double calcolaBollo() {
        return engineDisplacement * BASIC_BOLLO_TAX_RATE;
    }

}

class Test {
    public static void main(String[] args) {
        Car c = new Taxi(900, "ABCXXX91239");

        System.out.println("devi pagare " + c.calcolaBollo() + " euro");

        Suv t = new Suv(1100);
        System.out.println("devi pagare " + t.calcolaBollo() + " euro");
    }
}