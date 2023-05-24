package com.burakdelice.okul;

import com.burakdelice.utils.Dersler;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ders {

    private Dersler ad;
    private Ogretmen ogretmen;
    private int not1;
    private int not2;

    //TODO Notlar listeye çevrilecek.
    // List<Integer> notlar;

    public int ortalama(){
        return (getNot1()+getNot2())/2;
    }

}
