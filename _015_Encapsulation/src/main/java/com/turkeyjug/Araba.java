package com.turkeyjug;

public class Araba {

    private String marka;
    private String renk;
    private int model;
    private double motorHacmi;

    public Araba(String marka, String renk, int model, double motorHacmi) {
        this.marka = marka;
        this.renk = renk;
        this.model = model;
        this.motorHacmi = motorHacmi;

    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                '}';
    }

}
