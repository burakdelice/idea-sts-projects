public class AppMain {
    public static void main(String[] args) {


        int myArr[] = new int[6];

        try{

            myArr[2] = 10;
            myArr[4]= 5;
            myArr[0]= myArr[2]/myArr[4];
          //myArr[13]=200;

            try {

                myArr[13]=200;

            }catch (Exception e){
                System.out.println("İçteki catch: " + e);
            }finally {
                System.out.println("İçteki finally");
            }
        }catch (Exception e){
            System.out.println("Dıştaki catch: "+ e);
        }finally {
            System.out.println("Dıştaki finally");
        }
    }
}
