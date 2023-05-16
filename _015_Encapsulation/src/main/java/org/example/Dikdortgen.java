package org.example;

public class Dikdortgen {
    int uzunKenar;
    int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public int getHesaplaAlan() {
        return this.uzunKenar + this.kisaKenar;
    }

    public int getHesaplaCevre() {
        return 2 * (this.uzunKenar + this.kisaKenar);
    }
}
