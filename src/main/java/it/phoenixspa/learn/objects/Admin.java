package it.phoenixspa.learn.objects;

public class Admin extends User {

    public Admin(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String fullName() {
        return "Super " + super.fullName();
    }

}
