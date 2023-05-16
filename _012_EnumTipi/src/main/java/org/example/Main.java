package org.example;

public class Main {
    enum HaftaninGunleri {

        PAZARTESİ(), SALI(), ÇARŞAMBA(), PERŞEMBE(), CUMA(), CUMARTESİ("Spor"),PAZAR("Tatil");

        String mesaj;
        HaftaninGunleri() {
        System.out.println("Varsayılan - parametresiz");
        }

        HaftaninGunleri(String mesaj) {
            this.mesaj = mesaj;
            System.out.println("Parametreli : " + mesaj);
        }

    }

    public static void main(String[] args) {

        for (HaftaninGunleri gun : HaftaninGunleri.values()) {
            if (gun.mesaj != null) {
                System.out.println("\n" + gun + " " + gun.mesaj);
            }
        }
    }
}