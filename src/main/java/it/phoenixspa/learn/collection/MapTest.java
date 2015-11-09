package it.phoenixspa.learn.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import junit.framework.TestCase;

public class MapTest extends TestCase {

    public void testElements() throws Exception {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(21, "Enrico");
        map.put(3, "Anna");
        map.put(51, "Luca");
        map.put(913, "Luca");

        assertEquals(false, map.isEmpty());

        map.remove(21);

        assertEquals(3, map.size());
        assertEquals(true, map.containsKey(913));
        assertEquals(true, map.containsValue("Luca"));

        map.put(913, "Sara");

        assertEquals(3, map.size());
        assertEquals(false, map.containsValue("Enrico"));

        assertEquals(new Integer(51), map.keySet().iterator().next());
        assertEquals("Luca", map.values().iterator().next());

        Set<Entry<Integer, String>> entrySet = map.entrySet();
        for (Entry<Integer, String> each : entrySet) {
            System.err.print(each.getKey());
            System.err.print("\t => ");
            System.err.print(each.getValue() + "\n");
        }
    }
}