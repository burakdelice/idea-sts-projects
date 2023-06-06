package org.example;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OtoGaleri implements IOtoGaleri {
    private static final String FIRMA_ADI = "LOLO";
    private static List<Araba> arabalar;
    private static List<Musteri> musteriler;
    private static List<Kasiyer> kasiyerler;
    private static List<Kiralama> kiralamalar;


    private static <T> void listeyeEkle(List<T> gelenListe, T gelenNesne) {
        gelenListe.add(gelenNesne);
    }

    private void musteriOlustur() {
        Musteri musteri1 = new Musteri(1, "Serkan");
        Musteri musteri2 = new Musteri(2, "Burak");
        Musteri musteri3 = new Musteri(3, "Osman");
        Musteri musteri4 = new Musteri(4, "Gizem");
        listeyeEkle(musteriler, musteri1);
        listeyeEkle(musteriler, musteri2);
        listeyeEkle(musteriler, musteri3);
        listeyeEkle(musteriler, musteri4);
    }

    private void kasiyerOlustur() {
        Kasiyer kasiyer1 = new Kasiyer(1, "Salih", 30000.0);
        Kasiyer kasiyer2 = new Kasiyer(1, "Emine", 40000.0);
        Kasiyer kasiyer3 = new Kasiyer(1, "Murat", 50000.0);
        listeyeEkle(kasiyerler, kasiyer1);
        listeyeEkle(kasiyerler, kasiyer2);
        listeyeEkle(kasiyerler, kasiyer3);

    }
    private void arabaOlustur() {

        Araba araba1 = new Araba(1, "Mercedes");
        Araba araba2 = new Araba(2, "BMW");
        Araba araba3 = new Araba(3, "Kartal");
        Araba araba4 = new Araba(4, "Doğan");
        Araba araba5 = new Araba(5, "Şahin");
        Araba araba6 = new Araba(6, "Passat");
        Araba araba7 = new Araba(7, "Volvo");
        Araba araba8 = new Araba(8, "Jaguar");
        Araba araba9 = new Araba(9, "Mazda");
        Araba araba10 = new Araba(10, "Togg");

        listeyeEkle(arabalar, araba1);
        listeyeEkle(arabalar, araba2);
        listeyeEkle(arabalar, araba3);
        listeyeEkle(arabalar, araba4);
        listeyeEkle(arabalar, araba5);
        listeyeEkle(arabalar, araba6);
        listeyeEkle(arabalar, araba7);
        listeyeEkle(arabalar, araba8);
        listeyeEkle(arabalar, araba9);
        listeyeEkle(arabalar, araba10);

    }

    public void kiralamaOlustur() {
        Kiralama kiralama1 = new Kiralama(1, kasiyerler.get(0), musteriler.get(0), arabalar.get(0));
        arabalar.get(0).setDurum(EDurum.KIRADA);

        Kiralama kiralama2 = new Kiralama(2, kasiyerler.get(1), musteriler.get(1), arabalar.get(1));
        arabalar.get(1).setDurum(EDurum.KIRADA);

        Kiralama kiralama3 = new Kiralama(3, kasiyerler.get(2), musteriler.get(2), arabalar.get(2));
        arabalar.get(2).setDurum(EDurum.KIRADA);

        Kiralama kiralama4 = new Kiralama(4, kasiyerler.get(0), musteriler.get(3), arabalar.get(3));
        arabalar.get(3).setDurum(EDurum.KIRADA);

        Kiralama kiralama5 = new Kiralama(5, kasiyerler.get(3), musteriler.get(4), arabalar.get(7));
        arabalar.get(7).setDurum(EDurum.KIRADA);

        Kiralama kiralama6 = new Kiralama(7, kasiyerler.get(0), musteriler.get(0), arabalar.get(10));
        arabalar.get(10).setDurum(EDurum.KIRADA);

        Kiralama kiralama7 = new Kiralama(8, kasiyerler.get(1), musteriler.get(2), arabalar.get(4));
        arabalar.get(4).setDurum(EDurum.KIRADA);

        listeyeEkle(kiralamalar, kiralama1);
        listeyeEkle(kiralamalar, kiralama2);
        listeyeEkle(kiralamalar, kiralama3);
        listeyeEkle(kiralamalar, kiralama4);
        listeyeEkle(kiralamalar, kiralama5);
        listeyeEkle(kiralamalar, kiralama6);
        listeyeEkle(kiralamalar, kiralama7);

    }


    @Override
    public boolean kiralamaYap() throws OtoGaleriException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kasiyer id: ");
        int kasiyerId = Integer.parseInt(scanner.nextLine());
        Kasiyer kasiyer = kasiyerler.get(kasiyerId - 1);
        System.out.println("------------------");

        System.out.print("Müşteri id: ");
        int musteriId = Integer.parseInt(scanner.nextLine());
        Musteri musteri = musteriler.get(musteriId - 1);
        System.out.println("------------------");

        System.out.println("Kirada olmayan arabalar");
        arabalar.stream().filter(araba -> araba.getDurum().equals(EDurum.GALERIDE))
                .forEach(x -> System.out.println(x.getId() + " - " + x.getIsim() + " - " + x.getDurum()));

        System.out.println("Lütfen bir seçim yapınız");
        int arabaId = Integer.parseInt(scanner.nextLine());
        Araba araba = arabalar.get(arabaId - 1);

        if (araba.getDurum().equals(EDurum.KIRADA)) {
            throw new OtoGaleriException("Araba kirada. İşlem başarısız oldu.");
        } else {
            Kiralama kiralama = new Kiralama(kiralamalar.size() + 1, kasiyer, musteri, araba);
            kiralamalar.add(kiralama);
            return true;
        }
    }

    @Override
    public Araba arabaAra() throws OtoGaleriException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen araba adını giriniz.");
        String arananArabaMarkasi = scanner.nextLine();

        Optional<Araba> araba = arabalar.stream().filter(oto -> oto.getIsim()
                        .equalsIgnoreCase(arananArabaMarkasi))
                .findFirst();

        if (araba.isEmpty()) {
            throw new OtoGaleriException("Araba bulunamadı");
        }
        return araba.get();
    }

    @Override
    public Musteri musteriAra() throws OtoGaleriException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen müşteri adını giriniz.");
        String arananMusteri = scanner.nextLine();

        Optional<Musteri> musteri = musteriler.stream().filter(x -> x.getIsim()
                        .equalsIgnoreCase(arananMusteri))
                .findFirst();

        if (musteri.isEmpty()) {
            throw new OtoGaleriException("Müşteri bulunamadı");
        }
        return musteri.get();
    }

    @Override
    public List<Araba> kiralananArabaListesi() throws OtoGaleriException {
        List<Araba> kiralananArabalar = arabalar.stream()
                .filter(oto -> oto.getDurum()
                        .equals(EDurum.KIRADA))
                .collect(Collectors.toList());

        if (kiralananArabalar.isEmpty()){
            throw new OtoGaleriException("Şimdi kiralanan araba yok");
        }
        return kiralananArabalar;
    }

    public static void main(String[] args) {
        System.out.println("Oto Galeri");


        OtoGaleri otoGaleri = new OtoGaleri();

        otoGaleri.arabaOlustur();
        otoGaleri.kasiyerOlustur();
        otoGaleri.musteriOlustur();

        listeyeEkle(musteriler, new Musteri(5, "Aminenur"));
        listeyeEkle(musteriler, new Musteri(6, "Gani Ünal"));
        listeyeEkle(kasiyerler, new Kasiyer(4, "Abdullah", 33000.0));
        listeyeEkle(arabalar, new Araba(11, "Toyota"));

        otoGaleri.kiralamaOlustur();

        try {
            otoGaleri.arabaAra();
            otoGaleri.kiralamaYap();
            System.out.println(otoGaleri.kiralananArabaListesi());
            otoGaleri.musteriAra();
        } catch (OtoGaleriException e) {
            System.out.println(e.getMesaj());
        }

        System.out.println("Gan ile başlayan müşterilerin listesini bul.");
        System.out.println(ganIleBaslayanMusteriler());

        System.out.println("Araba adına göre müşterilerin listesini bul.");
        System.out.println(arabaAdinaGoreKiralayanMusteriler("BMW"));

        System.out.println("id bilgisi verilen müşterilerin kiraladığı arabaların listesini bul.");
        System.out.println(musteriIdyeGoreKiralananArabalar(1));

        System.out.println("id bilgisi verilen arabayı kiralayan müşteri listesini bul.");
        System.out.println(arabaIdyeGoreKiralayanMusteriler(1));

    }

    private static List<Araba> musteriIdyeGoreKiralananArabalar(int musteriId) {
    return kiralamalar.stream()
            .filter(musteri->musteri.getMusteri().getId() == musteriId)
            .map(oto->oto.getAraba()).collect(Collectors.toList());
    }
    private static List<Musteri> arabaIdyeGoreKiralayanMusteriler(int arabaId) {
        return kiralamalar.stream()
                .filter(oto->oto.getAraba().getId() == arabaId)
                .map(musteri->musteri.getMusteri()).collect(Collectors.toList());
    }


    private static List<Musteri> arabaAdinaGoreKiralayanMusteriler(String arabaAdi) {
        List<Musteri> musteriList = kiralamalar.stream()
                .filter(oto->oto.getAraba().getIsim()
                        .equalsIgnoreCase(arabaAdi)).map(musteri->musteri.getMusteri())
                .collect(Collectors.toList());

        return musteriList;
    }

    private static List<Musteri> ganIleBaslayanMusteriler() {
        List<Musteri> musteriList = musteriler.stream()
                .filter(m->m.getIsim().startsWith("Gan")).collect(Collectors.toList());
        return musteriList;
    }
}