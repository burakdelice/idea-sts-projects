package org.example;

public class AppMain {
    public static void main(String[] args) {

        Muhasebe muhasebe = new Muhasebe();
        muhasebe.setAdi("Burak");
        muhasebe.setSoyadi("Delice");
        muhasebe.setMaliYetki(true);
        muhasebe.setKidemYili((short) 3);
        muhasebe.setUnvani("Mali Müşavir");

        System.out.println("ADI: " + muhasebe.getAdi());
        System.out.println("ADI: " + muhasebe.getSoyadi());
        System.out.println("ADI: " + muhasebe.getMaliYetki());
        System.out.println("ADI: " + muhasebe.getKidemYili());
        System.out.println("ADI: " + muhasebe.getUnvani());
    }
}