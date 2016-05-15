package it.xpeppers.learn;

public class LicenseException extends Exception {

    private int codice;

    public LicenseException(String message, int codice) {
        super(message);
        this.codice = codice;
    }

    public int getCodice() {
        return codice;
    }
}
