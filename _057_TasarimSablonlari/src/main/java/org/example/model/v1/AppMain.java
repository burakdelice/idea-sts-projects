package org.example.model.v1;

import org.example.model.v1.Urun;

public class AppMain {
    public static void main(String[] args) {

        Urun urun1 = new Urun();
        urun1.setId(1l);
        urun1.setAdi("Kolonya");
        urun1.setFiyati(10.3);

        Urun urun2 = new Urun(2L,"Patates",2.7);
        System.out.println(urun1);
        System.out.println(urun2);

        urun1 = new Urun();
        urun1.setId(3L);
        urun1.setAdi("Karpuz");
        urun1.setFiyati(4.2);
        System.out.println(urun1);

        urun2 = new Urun(4L,"Kavun",3.3);
    }

}