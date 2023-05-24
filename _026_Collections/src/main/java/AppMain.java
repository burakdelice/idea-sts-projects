import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        double a = 5;
        List liste1 = new ArrayList();
        liste1.add(20);
        liste1.add(40);
        liste1.add(30);
        System.out.println(liste1);
        List<Integer> liste2 = new ArrayList<>();
        liste2.add(4);
        List<Integer> liste3 = new ArrayList<>();
        liste3.add(4);
        liste3.add(5);
       liste2.removeAll(liste3);
        System.out.println(liste2);
        Collections.sort(liste1);
        System.out.println(liste1);
    }
}
