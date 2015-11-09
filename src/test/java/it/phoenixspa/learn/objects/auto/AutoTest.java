package it.phoenixspa.learn.objects.auto;

import junit.framework.TestCase;

public class AutoTest extends TestCase {

    public void testVelocità() throws Exception {
        Auto a = new Auto();
        a.accelera(20);
        assertEquals(20, a.getVelocita());

        Taxi t = new Taxi("AB123MK");
        t.accelera(10);
        assertEquals(10, t.getVelocita());
    }

    public void testClassName() throws Exception {
        Auto auto = new Auto();
        assertEquals("it.phoenixspa.learn.objects.auto.Auto", auto.className());
    }

    public void testAutoAreEqualsWhenHaveSameCilindrata() throws Exception {
        Auto auto = new Auto(30);
        auto.cilindrata = 1000;

        Auto sameCilindrata = new Auto(40);
        sameCilindrata.cilindrata = 1000;

        assertTrue(auto.equals(sameCilindrata));

        Auto different = new Auto(30);
        different.cilindrata = 45643;

        assertFalse(auto.equals(different));
    }

    public void testEqualsHandleDifferentType() throws Exception {
        Auto auto = new Auto();
        assertFalse(auto.equals("ciao"));
    }

    public void testAutoEqualsTaxiWithSameCilindrata() throws Exception {
        Auto auto = new Auto();
        auto.cilindrata = 10;

        Taxi taxi = new Taxi("asdasd");
        taxi.cilindrata = 10;

        Taxi taxi2 = new Taxi("23123123");
        taxi2.cilindrata = 10;

        assertTrue(auto.equals(auto));

        assertTrue(auto.equals(taxi));
        assertTrue(taxi.equals(auto));

        assertTrue(auto.equals(taxi));
        assertTrue(taxi.equals(taxi2));
        assertTrue(auto.equals(taxi2));

        assertFalse(auto.equals(null));
    }

    public void testDownCastingOkWhenMovingDownInTheHierarchy() throws Exception {
        Auto a = new Taxi("esdf");
        System.err.println(a.getClass().getName());
    }

    // TODO: parlare delle eccezioni e del blocco try-catch
    public void xtestDownCastingFailsAtRuntimeWhenYouCastToIncompatibleType() throws Exception {
        Object object = new String("something");

        Auto a = (Auto) object;
        assertNotNull(a);
    }

    public void testname() throws Exception {
        Taxi taxi = new Taxi("23123");

        Object o = taxi;
    }

}
