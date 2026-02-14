package arrays;

import java.util.Arrays;

public class SmallestLargestSwap {
    static int[] swapMinMax(int[] arr , int size){
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        int max_index=0;
        int min_index=0;
        for(int i=0;i<size;i++){
            if(arr[i]>Max){
                Max = arr[i];
                max_index=i;
            }
            else if(arr[i]<Min){
                Min = arr[i];
                min_index=i;
            }
        }
        int temp = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = temp;
        return arr;
    }
    public static void main(String[] args){
        int[] arr={21,20,52,31,21,52,2,15,96,16};
        System.out.println(Arrays.toString(swapMinMax(arr,arr.length-1)));
    }
}
