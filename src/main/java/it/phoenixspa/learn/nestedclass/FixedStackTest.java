package it.phoenixspa.learn.nestedclass;

import java.util.Enumeration;

import junit.framework.TestCase;

public class FixedStackTest extends TestCase {

    public void testStackElements() throws Exception {
        FixedStack stack = new FixedStack(5);
        stack.push("first");
        stack.push("second");
        stack.push("third");

        Enumeration elements = stack.elements();

        assertTrue(elements.hasMoreElements());

        assertEquals("third", elements.nextElement());
        assertEquals("second", elements.nextElement());
        assertEquals("first", elements.nextElement());

        assertFalse(elements.hasMoreElements());
    }
}
