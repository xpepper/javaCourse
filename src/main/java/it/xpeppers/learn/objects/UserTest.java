package it.xpeppers.learn.objects;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    public void testTeenagerCannotEnterInPub() throws Exception {
        User teen = User.createWithNameSurnameAndAge("Paolino", "Paperino", 14);

        assertFalse("Expecting user to NOT be allowed to enter", teen.possoEntrareAlPub());
    }

    public void testAdultCanEnterIntoPub() throws Exception {
        User adult = User.createWithNameSurnameAndAge("Paolino", "Paperino", 24);

        assertTrue(adult.possoEntrareAlPub());
    }

    public void testFullName() throws Exception {
        User user = User.createWithNameSurnameAndAge("Piero", "Di Bello", 33);
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
