package it.phoenixspa.learn;

public class Taxi extends Car {

    String license;

    public Taxi(int engineDisplacement, String license) {
        super(engineDisplacement);
        this.license = license;
    }

    void renewLicense() {
        if (license.startsWith("2014")) {
            license = "2015" + license;
        }
    }

    @Override
    double calcolaBollo() {
        return 250;
    }

    @Override
    public String librettoDiCircolazione() {
        return "Taxi, circolazione in centro sempre.\n" + "Con cilindrata " + engineDisplacement + " e bollo in euro " + calcolaBollo();
    }
}