package arrays;

public class MaximumSubarraySum {
    public static void main(String[] arsg){
        int[] arr = {1,2,3,5};
        int MaxSum = Integer.MIN_VALUE;
        for(int start=0;start<arr.length;start++ ){
            int currSum =0;
            for(int end =start+1;end<arr.length;end++ ){
                currSum+=arr[end];
                MaxSum = Math.max(currSum,MaxSum);
            }
        }
        System.out.println(MaxSum);
    }
}
