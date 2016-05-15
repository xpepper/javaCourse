package it.xpeppers.learn.objects;

public class Admin extends User {

    static {
        System.err.println("caricata la classe ADMIN!");
    }

    public Admin(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String fullName() {
        return "Super " + super.fullName();
    }

}
