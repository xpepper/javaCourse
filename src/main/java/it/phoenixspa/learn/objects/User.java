package it.phoenixspa.learn.objects;

public class User {
    String name;
    String surname;
    Integer age = 0;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Boolean possoEntrareAlPub() {
        return age >= 18;
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