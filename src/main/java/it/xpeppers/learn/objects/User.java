package it.xpeppers.learn.objects;

public class User {
    private static final int MAGGIORENNE = 18;

    private final String name;
    private final String surname;
    private Integer age = 0;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static User createWithNameSurnameAndAge(String name, String surname, int age) {
        User user = new User(name, surname);
        user.age = age;
        return user;
    }

    Boolean possoEntrareAlPub() {
        return age >= MAGGIORENNE;
    }

    void invecchia(Integer anniDaInvecchiare) {
        age += anniDaInvecchiare;
    }

    public int fullNameLength() {
        return name.length() + surname.length();
    }

    public String fullName() {
        return surname + " " + name;
    }

}
