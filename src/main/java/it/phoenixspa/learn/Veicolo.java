package it.phoenixspa.learn;

public abstract class Veicolo implements Collaudabile {
    private String codice;

    public Veicolo(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }
}