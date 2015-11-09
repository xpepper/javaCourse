package it.phoenixspa.learn;

import junit.framework.TestCase;

public class ReverseArrayTest extends TestCase {

    public void testReverseArray() throws Exception {
        Integer[] array = new Integer[] { 1, 4, 6, 0 };
        Integer[] reversed = new ReverseArray<Integer>(array).reverse();

        assertEquals(new Integer(0), reversed[0]);
        assertEquals(new Integer(6), reversed[1]);
        assertEquals(new Integer(4), reversed[2]);
        assertEquals(new Integer(1), reversed[3]);
    }

    public void testWithEmptyArray() throws Exception {
        Integer[] empty = new Integer[0];
        Integer[] reversed = new ReverseArray<Integer>(empty).reverse();

        assertEquals(0, reversed.length);
    }

    public void testWithNullArray() throws Exception {
        Integer[] reversed = new ReverseArray<Integer>(null).reverse();

        assertNull(reversed);
    }

    public void testHasNoSideEffectOnInputArray() throws Exception {
        Integer[] array = new Integer[] { 1, 4, 6, 0 };
        new ReverseArray<Integer>(array).reverse();

        assertEquals(new Integer(1), array[0]);
        assertEquals(new Integer(4), array[1]);
        assertEquals(new Integer(6), array[2]);
        assertEquals(new Integer(0), array[3]);
    }

}
