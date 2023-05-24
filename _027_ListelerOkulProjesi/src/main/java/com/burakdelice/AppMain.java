package com.burakdelice;

import com.burakdelice.okul.Ders;
import com.burakdelice.okul.Ogrenci;
import com.burakdelice.okul.Ogretmen;
import com.burakdelice.okul.Sinif;
import com.burakdelice.utils.Branslar;
import com.burakdelice.utils.Dersler;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setAd("Aminenur");
        ogretmen.setSoyad("Göynük");
        ogretmen.setBrans(Branslar.Matematik);
        ogretmen.setTelefon("0123456789");
        ogretmen.setAdres("Ankara");

        Ogretmen ogretmen2 = new Ogretmen(Branslar.Ingilizce, "Aysu", "Çağışlar", "0987654321", "İzmir");

        List<Ogretmen> ogretmenList = new ArrayList<>();
        ogretmenList.add(ogretmen);
        ogretmenList.add(ogretmen2);
        //-----------------------------------------------

        List <Ders> dersList = new ArrayList<>();
        dersList.add(new Ders(Dersler.Geometri, ogretmenList.get(0), 0, 0));
        dersList.add(new Ders(Dersler.Matematik, ogretmen, 0, 0));
        dersList.add(new Ders(Dersler.Ingilizce, ogretmen2, 0, 0));
        //-----------------------------------------------

        List <Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(new Ogrenci("Mehmet", "Caner", "Çanakkale", "123",
                dersList));
        ogrenciList.add(new Ogrenci("Orhun", "Bayındır", "Adana", "101",
                dersList.subList(1,2)));
        //-----------------------------------------------

        Sinif sinif = new Sinif(20, true,false,"101-Aziz Sancar",
                ogrenciList, ogretmenList);
        System.out.println(sinif.getSubeNo());
        System.out.println(sinif.getOgrenciListesi().get(0).getAd());
        System.out.println(sinif.getOgrenciListesi().get(0).getSoyad());
        System.out.println(sinif.getOgrenciListesi().get(0).getDersListesi().get(0).getOgretmen().getBrans());

        System.out.println(sinif.getOgretmenListesi().get(0).getAd());
        System.out.println(sinif.getOgretmenListesi().get(0).getSoyad());


    }
}
