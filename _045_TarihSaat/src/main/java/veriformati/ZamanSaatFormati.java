package veriformati;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ZamanSaatFormati {
    public static void main(String[] args) {
        Date simdi = new Date();
        System.out.println(simdi);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tarihBilgisi = simpleDateFormat.format(simdi);
        System.out.println(tarihBilgisi);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateObj = LocalDate.now();
        String formatlanmisVeri = dateObj.format(dateTimeFormatter);
        System.out.println(formatlanmisVeri);

        String formatlanmisVeri2 = dateObj.format(dateTimeFormatter);
        System.out.println(formatlanmisVeri2);
    }
}
