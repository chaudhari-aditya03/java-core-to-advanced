package arrays;

import java.util.Arrays;

public class ReplaceAllNegativeNumbersToZero {
    public static void main(String[] args) {
         int[] arr = {10,20,-12,0,34,0,-8,-25,78,95,-12};
        System.out.println(Arrays.toString(arr));
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i]<0)
             {
                 arr[i]=0;
             }
         }
        System.out.println(Arrays.toString(arr));
    }
}
