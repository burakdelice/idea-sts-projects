package com.burakdelice.okul;

import com.burakdelice.utils.Branslar;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

    //TODO miras yapılacak
    private Branslar brans;
    private String ad;
    private String soyad;
    private String telefon;
    private String adres;

}
