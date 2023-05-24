package com.burakdelice.okul;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sinif {

    int sirasSayi;
    boolean projeksiyon;
    boolean akilliTahta;
    String subeNo;
    List<Ogrenci> ogrenciListesi;
    List<Ogretmen> ogretmenListesi;

}
