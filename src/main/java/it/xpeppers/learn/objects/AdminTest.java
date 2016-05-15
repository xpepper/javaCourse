package it.xpeppers.learn.objects;

import junit.framework.TestCase;

public class AdminTest extends TestCase {

    public void testFullNameHasSpecialPrefix() throws Exception {
        Admin admin = new Admin("Piero", "Di Bello");
        assertEquals("Super Di Bello Piero", admin.fullName());
    }
}
