package hashmap;

import java.util.HashMap;

public class CountFrequencyOfEachElementOfArray {
    public static void main(String[] args)
    {
        int count =1;
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int [] arr ={10,20,30,40,40,60,60,30,20};
        for(int i=0;i<arr.length;i++) {
            h1.put(arr[i], count);
        }
        System.out.println(h1);
    }
}
