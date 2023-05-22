package org.example;

public class AppMain {
    public static void main(String[] args) {

     //   Hayvan hayvan = new Hayvan();
       // Soyut sınıftan asla nesne oluşturulamaz.

       Kedi kedi = new Kedi();
       kedi.yemekYe();
       kedi.sesVer();

       Kopek kopek = new Kopek();
       kopek.yemekYe();
       kopek.sesVer();

    }
}
