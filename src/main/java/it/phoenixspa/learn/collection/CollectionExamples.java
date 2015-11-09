package it.phoenixspa.learn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExamples {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(new Integer(1), "Enrico");
        map.put(new Integer(2), "Mario");
        map.put(new Integer(4), "Luca");
        map.put(new Integer(10), "Luca");

        System.out.println(map.size());
        map.remove(new Integer(10));
    }
}
