package it.phoenixspa.learn.objects.auto;

class Taxi extends Auto {
    String licenza;

    Taxi(String licenza) {
        this.licenza = licenza;
    }

    public String licenza() {
        return "Licenza Taxi: " + licenza;
    }
}