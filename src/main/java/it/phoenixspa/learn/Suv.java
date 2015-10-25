package it.phoenixspa.learn;

public final class Suv extends Car {

    public Suv(int engineDisplacement) {
        super(engineDisplacement);
    }

    @Override
    double calcolaBollo() {
        return super.calcolaBollo() * 2;
    }

    @Override
    public String librettoDiCircolazione() {
        return "Suv\n" + "con cilindrata " + engineDisplacement + " e bollo in euro " + calcolaBollo();
    }
}