package org.example.isyeri;

public class AppIsYeriMerkez {
    public static void main(String[] args) {

        Yazilimci yazilimci = new Yazilimci();

        System.out.println("MAAŞ : " + (yazilimci.asgariUcret + yazilimci.bonus));
        System.out.println("SGK : " + yazilimci.sigorta);
        System.out.println("ÖZEL SAĞLIK SİGORTA : " + yazilimci.ozelSaglikSigortasi);
        System.out.println("İZİN HAKKI : " + yazilimci.izinHakki);

        Ceo ceo = new Ceo();
        System.out.println(ceo.asgariUcret+ceo.bonus);
        System.out.println(ceo.sigorta);
        System.out.println(ceo.izinHakki+ ceo.ekIzin);





    }
}
