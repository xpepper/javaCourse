package it.xpeppers.learn.objects.override;

class Car {
    int engineDisplacement;
    int currentSpeed;

    public Car(int speed) {
        currentSpeed = speed;
    }

    void accelerate(int speedGain) {
        currentSpeed += speedGain;
    }
}

class Taxi extends Car {
    String license;

    public Taxi(int speed) {
        super(speed);
    }

    @Override
    void accelerate(int speedGain) {
        if (speedGain > 10) {
            currentSpeed += 10;
        } else {
            super.accelerate(speedGain);
        }
    }
}

