package it.phoenixspa.learn.test;

import it.phoenixspa.learn.Car;
import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testCalcolaBollo() {
        Car car = new Car(1000);
        assertEquals(750.0, car.calcolaBollo());

        Car suv = Car.createSuv();
        assertEquals(1500.0, suv.calcolaBollo());
    }
}
