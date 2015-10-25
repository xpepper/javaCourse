package it.phoenixspa.learn;

import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testCalcolaBollo() {
        Car car = new Utilitaria();
        assertEquals(750.0, car.calcolaBollo());
    }
}
