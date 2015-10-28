package it.phoenixspa.learn.objects;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void testTeenagerCannotEnterInPub() throws Exception {
        User teen = new User("Paolino", "Paperino");
        teen.age = 14;

        assertFalse("Expecting user to NOT be allowed to enter", teen.possoEntrareAlPub());
    }

    public void testAdultCanEnterIntoPub() throws Exception {
        User adult = new User("Paolino", "Paperino");
        adult.age = 24;

        assertTrue(adult.possoEntrareAlPub());
    }

    public void testFullName() throws Exception {
        User user = new User("Piero", "Di Bello");
        assertEquals("Di Bello Piero", user.fullName());
    }

    public void testFullNameLength() throws Exception {
        assertEquals(0, new User("", "").fullNameLength());
        assertEquals(10, new User("12345", "12345").fullNameLength());
    }

    public void xtestErrorWhenNameIsUndefined() throws Exception {
        new User(null, "anySurname").fullNameLength();
    }
}
