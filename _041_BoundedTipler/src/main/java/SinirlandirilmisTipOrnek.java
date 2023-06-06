public class SinirlandirilmisTipOrnek <GelenTip1 extends Number>{
    GelenTip1 bilgi;
    void yazdir(){
        System.out.println("Sınırlandırılmış Tip"+ bilgi.getClass().getName());
    }
}
