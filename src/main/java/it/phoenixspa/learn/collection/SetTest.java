package it.phoenixspa.learn.collection;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

public class SetTest extends TestCase {

    public void testElements() throws Exception {
        Set<Integer> numberSet = new HashSet<Integer>();
        numberSet.add(new Integer(10));
        numberSet.add(new Integer(1));
        numberSet.add(new Integer(-1));
        numberSet.add(new Integer(1));
        numberSet.add(new Integer(10));

        assertEquals(false, numberSet.isEmpty());

        assertEquals(3, numberSet.size());

        assertEquals(false, numberSet.contains("10"));
        assertEquals(true, numberSet.contains(1));

        assertEquals(new Integer(1), numberSet.iterator().next());

        for (Integer each : numberSet) {
            System.err.println(each);
        }
    }
}