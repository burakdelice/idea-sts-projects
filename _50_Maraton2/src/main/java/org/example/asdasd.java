package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class asdasd {
    public static void main(String[] args) {


    String array[]= {"5","j","2","a","3","v","a"};
    int toplam=0;
    String value="";
	for (int i = 0; i < array.length; i++) {

        try {
            int x = Integer.parseInt(array[i]);
            toplam += x;
        } catch (Exception e) {
            value += array[i];
        } finally {
            toplam += 1;
            value = "";
        }
    }


		System.out.print(toplam);
 System.out.print(value.replace("a", "e"));

        List< Integer> list= Arrays.asList(1,5,6,7);

        list=list.stream().forEach(t-> t).collect(Collectors.toList());

        for (Integer integer : list) {
            System.out.println(integer);
        }
}
}