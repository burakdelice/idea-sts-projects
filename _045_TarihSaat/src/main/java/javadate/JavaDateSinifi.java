package javadate;

import java.util.Date;

public class JavaDateSinifi {
    public static void main(String[] args) {
        Date zaman = new Date();

        System.out.println("Zaman bilgisi: " + zaman);

        System.out.println("Milisaniye: " + zaman.getTime());

        System.out.println("After :" + zaman.after(zaman));
        System.out.println("Before:" + zaman.before(zaman));
    }
}
