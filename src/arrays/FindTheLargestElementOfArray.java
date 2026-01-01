package arrays;

public class FindTheLargestElementOfArray {
    public static void main(String[] args)
    {                                                //binary  //octal
        int [] arr = {-1,-45,-15,-72,-95,1};
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Largest Element From Given Array is : "+max);
    }
}
