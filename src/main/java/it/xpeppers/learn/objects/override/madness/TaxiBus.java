package it.xpeppers.learn.objects.override.madness;

public class TaxiBus extends Taxi {

    @Override
    void accelerate(int speedGain) {
        currentSpeed++;
    }
}
