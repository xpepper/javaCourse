package it.xpeppers.learn.objects.override;

import junit.framework.TestCase;

public class CarTest extends TestCase {
    public void testname() throws Exception {
        Taxi taxi = new Taxi(12);
        taxi.accelerate(123);
        assertEquals(12+10, taxi.currentSpeed);
    }
}
