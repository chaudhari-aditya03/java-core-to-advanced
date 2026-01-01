package arrays;

import java.util.Arrays;

public class MultiplyEachElementBy2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=arr[i]*2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
