package it.phoenixspa.learn.objects.auto;

class Auto {
    int cilindrata;
    int velocita;

    void accelera(int valore) {
        velocita += valore;
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
}

class Taxi extends Auto {
    String licenza;

    Taxi(String licenza) {
        this.licenza = licenza;
    }

    public String licenza() {
        return "Licenza Taxi: " + licenza;
    }
}
