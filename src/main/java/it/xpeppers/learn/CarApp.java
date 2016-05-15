package it.xpeppers.learn;

public class CarApp {

    public static void main(String[] args) throws LicenseException {
        int cilindrata = 2000;
        String license = "";
        if (args.length == 2) {
            try {
                cilindrata = Integer.parseInt(args[0]);
                license = args[1];
            } catch (NumberFormatException ex) {
                System.out.println("formato errato");
            }
        }
        Taxi taxi = new Taxi(cilindrata, license);
        stampaImporto(taxi);
    }

    private static void stampaImporto(Taxable taxable) {
        System.out.println("Il bollo per " + taxable + " è pari a euro " + taxable.calcolaBollo());
    }

}
