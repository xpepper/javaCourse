package it.phoenixspa.learn.test;

import it.phoenixspa.learn.Car;
import it.phoenixspa.learn.Taxable;
import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testCalcolaBollo() {
        Taxable car = new Car(1000);
        assertEquals(750.0, car.calcolaBollo());

        Taxable suv = Car.createSuv();
        assertEquals(1500.0, suv.calcolaBollo());
    }
}
