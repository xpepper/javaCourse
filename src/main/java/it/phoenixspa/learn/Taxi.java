package it.phoenixspa.learn;

public class Taxi extends Car {

    String license;

    public Taxi(int engineDisplacement, String license) {
        super(engineDisplacement);
        this.license = license;
    }

    @Override
    public Double calcolaBollo() {
        return super.calcolaBollo() / 2;
    }

    void renewLicense() {
        if (license.startsWith("2014")) {
            license = "2015" + license;
        }
    }

}