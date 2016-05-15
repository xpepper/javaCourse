package it.xpeppers.learn.test;

import it.xpeppers.learn.Car;
import it.xpeppers.learn.Taxable;
import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testCalcolaBollo() {
        Taxable car = new Car(1000);
        assertEquals(750.0, car.calcolaBollo());

        Taxable suv = Car.createSuv();
        assertEquals(1500.0, suv.calcolaBollo());
    }

    public void testDataImmatricolazione() throws Exception {
        Car car = new Car(700);
        assertTrue(car.dataImmatricolazione().contains("-2015")); //wow terrible test!
        assertTrue(car.dataImmatricolazione().matches("\\d{2}-\\d{2}-\\d{4}\\s\\d{2}:\\d{2}")); //better... any other improvement?
    }
}
