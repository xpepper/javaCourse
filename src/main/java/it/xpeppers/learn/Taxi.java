package it.xpeppers.learn;

public class Taxi extends Car {

    private String license;

    public Taxi(int engineDisplacement, String license) throws LicenseException {
        super(engineDisplacement);

        if (license == null || license.trim().length() == 0) {
            throw new LicenseException("invalid license", 0);
        }
        this.license = license;
    }

    @Override
    public Double calcolaBollo() {
        return super.calcolaBollo() / 2;
    }

    public String getLicense() {
        return license;
    }

    public void renewLicense() {
        if (license.startsWith("2014")) {
            license = "2015" + license;
        }
    }


}