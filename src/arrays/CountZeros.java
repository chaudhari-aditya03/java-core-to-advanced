package arrays;

public class CountZeros {
    public static void main(String[] args) {
        int[] arr = {10,20,-12,0,34,0,78,0,78,95,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            {
                count++;
            }
        }
        System.out.println("Number of Zeros in the Given Array is "+count);
    }
}
