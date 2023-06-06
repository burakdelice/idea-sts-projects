package lambda02;

import lambda01.Sekil;

public class ParametresşzGeriDonusTipiOrnegi {
    public static void main(String[] args) {
        Sekil sekil1 = new Sekil() {
            @Override
            public void dikdortgen() {

            }
        };
        System.out.println(sekil1.dikdortgen());
    }
}
