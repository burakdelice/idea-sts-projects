package org.example;

public class Kopek extends Hayvan {
   @Override
    public void yemekYe(){
       System.out.println("Kedi sınıfındaki yemek yeme normal metodu. EZME");

    }

    @Override
    public void sesVer() {
        System.out.println("Miyav Miyav- abstract metod");
    }
}
