package arrays;

import java.util.Arrays;

public class UniqueValues {
    static int findUniqueValues(int[] arr) {
        int unique=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    unique = arr[i];
                }
            }
        }
        return unique;
    }
    public static void main(String[] args){
        int[] arr ={1,2,1,24,2,3,61,4,61,3};
        Arrays.sort(arr);
        System.out.println(findUniqueValues(arr));
    }
}
