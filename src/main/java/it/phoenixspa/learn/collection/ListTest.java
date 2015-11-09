package it.phoenixspa.learn.collection;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class ListTest extends TestCase {

    public void testListElements() throws Exception {
        List<String> strings = new ArrayList<String>();
        strings.add("ABC");
        strings.add("XYZ");

        assertEquals(false, strings.isEmpty());

        assertEquals(2, strings.size());

        assertEquals(true, strings.contains("ABC"));
        assertEquals(false, strings.contains("AbC"));

        assertEquals("ABC", strings.iterator().next());

        for (String each : strings) {
            System.err.println(each);
        }
    }
}
