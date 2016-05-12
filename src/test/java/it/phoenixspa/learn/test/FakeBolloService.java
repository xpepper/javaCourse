package it.phoenixspa.learn.test;

import it.phoenixspa.learn.BolloService;

public class FakeBolloService implements BolloService {

    private boolean called = false;

    public double computeBolloFor(int engineDisplacement) {
        called = true;
        return 0;
    }

    public boolean hasBeenCalled() {
        return called;
    }

}
