package it.phoenixspa.learn;

public abstract class Car {
    private static final int DEFAULT_ENGINE_DISPLACEMENT = 1000;

    int engineDisplacement;
    int currentSpeed;

    private BolloService bolloService;

    public Car() {
        this(DEFAULT_ENGINE_DISPLACEMENT, new AciBolloService());
    }

    public Car(int engineDisplacement) {
        this(engineDisplacement, new AciBolloService());
    }

    public Car(int engineDisplacement, BolloService service) {
        this.engineDisplacement = engineDisplacement;
        this.bolloService = service;
    }

    public abstract String librettoDiCircolazione();

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }

    double calcolaBollo() {
        return bolloService.computeBolloFor(engineDisplacement);
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