package collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a1.add(i+1);
        }
        System.out.println(a1);
        System.out.println(a1.get(1));
    }
}