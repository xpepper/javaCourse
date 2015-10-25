package it.phoenixspa.learn;

public class Nave extends Veicolo {

    public Nave(String codice) {
        super(codice);
    }

    public boolean collauda() {
        return galleggia();
    }

    private boolean galleggia() {
        return true;
    }
}
