package lambda01;

public class ParametresizLambda {
    public static void main(String[] args) {



        Sekil sekil1 = new Sekil() {
            @Override
            public void dikdortgen() {

            }
        } ;
        sekil1.dikdortgen();

        Sekil sekil2 = () -> {
            System.out.println("parametresiz lambda Örneği");
        };

    }


}
