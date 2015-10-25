package it.phoenixspa.learn;

public class AciBolloService implements BolloService {
    private static double BASIC_BOLLO_TAX_RATE = 0.75;

    public double computeBolloFor(int engineDisplacement) {
        return engineDisplacement * BASIC_BOLLO_TAX_RATE;
    }


}
