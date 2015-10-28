package it.phoenixspa.learn.objects.override.madness;

class Car {
    int engineDisplacement;
    int currentSpeed;

    void accelerate(int speedGain) { currentSpeed += speedGain; }
}

class Taxi extends Car {
    private String license;


    @Override
    void accelerate(int speedGain) {
        System.err.println("sono accelarate di taxi");
        if (speedGain > 10) {
            currentSpeed += 10;
        } else {
            super.accelerate(speedGain);
        }
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}

class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate(20);
        System.out.println(c.currentSpeed);

        Taxi t = new Taxi();
        t.accelerate(20);
        System.out.println("velocita di c: " + c.currentSpeed);
        System.out.println("velocita di t: " + t.currentSpeed);

        Car anotherCar = new Taxi();
        anotherCar.accelerate(22);

        System.out.println("velocita di anotherCar: " + anotherCar.currentSpeed);
    }
}