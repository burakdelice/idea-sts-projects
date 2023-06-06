package org.example;

public class OtoGaleriException extends Exception {

    private String mesaj;

    public OtoGaleriException(String message) {
        super(message);

    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}
