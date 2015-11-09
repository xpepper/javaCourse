package it.phoenixspa.learn.collection;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ListTest extends TestCase {

    public void testListElements() throws Exception {
        Collection list = new ArrayList();
        list.add("ABC");
        list.add(new Integer(10));

        assertEquals(false, list.isEmpty());

        int expectedSize = 2;
        assertEquals(expectedSize, list.size());

        assertEquals(true, list.contains("ABC"));
        assertEquals(false, list.contains("AbC"));

        assertEquals("ABC", list.iterator().next());

        for (Object each : list) {
            System.err.println(each);
        }
    }
}
