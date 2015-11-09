package it.phoenixspa.learn.objects.auto;

public class Auto {
    int cilindrata;
    private int velocita;

    public Auto() {
        this(0);
    }

    public Auto(int velocità) {
        velocita = velocità;
    }

    void accelera(int valore) {
        this.velocita = getVelocita() + valore;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            Auto other = (Auto) obj;
            return cilindrata == other.cilindrata;
        } else {
            return false;
        }
    }

    public String className() {
        return getClass().getName();
    }

    public int getVelocita() {
        return velocita;
    }

}

class Other {
    public static void main(String[] args) {
        Auto auto = new Auto();
    }

}


