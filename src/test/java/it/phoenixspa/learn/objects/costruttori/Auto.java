package it.phoenixspa.learn.objects.costruttori;

class Auto {
    int velocità;
    int cilindrata;

    public Auto(int v, int c) {
        velocità = v;
        cilindrata = c;
    }

    public Auto(int v) {
        this(v, 1000);
    }

    public Auto() {
        this.velocità = 0;
        this.cilindrata = 0;
        System.err.println("Auto!");
    }
}

class Taxi extends Auto {
    String licenza;

    public Taxi() {
        super();
        // chiama prima il costruttore vuoto della superclasse (Auto)
        // chiama poi questo costruttore
        this.licenza = "DEFAULT LICENSE";
        System.err.println("Taxi!");
    }
}

class Test {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
    }
}