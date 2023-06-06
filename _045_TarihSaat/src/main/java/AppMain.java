import java.time.*;
import java.util.Date;


public class AppMain {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new Date().getTime());
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println("-------------------");

        int yil = 2024;
        int ay = 1;
        int gun = 8;
        LocalDate localDate = LocalDate.of(yil,ay,gun);
        System.out.println(localDate);

        localDate = LocalDate.of(2024, Month.JANUARY,8);
        LocalTime localTime = LocalTime.of(23, 59,59,59);
        System.out.println("-------------------");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2028,8,25,14,53,10,1,ZoneId.of("Europe/Istanbul"));
        System.out.println(zonedDateTime);
        System.out.println("-------------------");

        Long start1 = System.currentTimeMillis();
        System.out.println(start1);
        Long start2 = System.nanoTime();
        System.out.println(start2);
        
        Instant instant_start = Instant.now();
        System.out.println(instant_start);
        Instant instant_stop = Instant.now();
        System.out.println(instant_stop);

        Long baslangic = System.currentTimeMillis();
        long toplam = 0;
        for (int i = 0; i < 2_000_000_000 ; i++) {
            toplam += i;
        }

        Long sonuc = System.currentTimeMillis();

        System.out.println("Toplam: "+ toplam);
        System.out.println("Başlangıç: "+baslangic);
        System.out.println("Sonlandırma: "+ sonuc);
        System.out.println("Fark: " + (sonuc-baslangic));
    }

}
