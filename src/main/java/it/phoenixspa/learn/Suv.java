package it.phoenixspa.learn;

final class Suv extends Car {

    public Suv(int engineDisplacement) {
        super(engineDisplacement);
    }

    @Override
    public Double calcolaBollo() {
        return 2 * super.calcolaBollo();
    }
}