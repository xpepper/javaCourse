package it.phoenixspa.learn.objects.override.madness;

public class TaxiBus extends Taxi {

    @Override
    void accelerate(int speedGain) {
        currentSpeed++;
    }
}
