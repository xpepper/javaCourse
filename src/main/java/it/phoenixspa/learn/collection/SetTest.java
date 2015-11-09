package it.phoenixspa.learn.collection;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class SetTest extends TestCase {

    public void testElements() throws Exception {
        Set set = new HashSet();
        set.add(new Integer(10));
        set.add(new Integer(1));
        set.add(new Integer(-1));
        set.add(new Integer(1));
        set.add(new Integer(10));

        assertEquals(false, set.isEmpty());

        int expectedSize = 3;
        assertEquals(expectedSize, set.size());

        assertEquals(false, set.contains("10"));
        assertEquals(true, set.contains(1));

        assertEquals(1, set.iterator().next());

        for (Object each : set) {
            System.err.println(each);
        }
    }
}