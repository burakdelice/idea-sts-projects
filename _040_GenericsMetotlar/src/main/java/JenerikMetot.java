public class JenerikMetot {

    public <GelenTip1,GelenTip2>void ekrandaYaz(GelenTip1 plaka,GelenTip2 sehir) {
        System.out.println(plaka.getClass().getName());
        System.out.println(sehir.getClass().getName());
        System.out.println("----------------------------");

    }
}
