package it.phoenixspa.learn;

public class Aereo extends Veicolo {
    private int ali;

    public Aereo(String codice, int ali) {
        super(codice);
        this.ali = ali;
    }

    public boolean collauda() {
        return (ali == 2);
    }
}

class TestOnVeicolo {
    public static void main(String[] args) {
        Veicolo[] veicoli = { new Aereo("A01", 2), new Nave("N02") };
        for (int i = 0; i < veicoli.length; i++) {
            System.out.println(veicoli[i].collauda());
        }

    }
}