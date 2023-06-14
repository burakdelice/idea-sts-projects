package org.example.ornek02interface;

 class BasitSinif implements Runnable{
        @Override
        public void run() {

            System.out.println("Thread çalışıyor.");

            for (int i = 0; i < 10; i++) {
                System.out.println("i : " + i);
            }
        }
    }
public class AppMain {
    public static void main(String[] args) {
        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread başlıyor.");
        Thread thread = new Thread(basitSinif);
        thread.start();

    }
}
