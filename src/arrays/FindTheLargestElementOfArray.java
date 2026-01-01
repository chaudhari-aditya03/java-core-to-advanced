package arrays;

public class FindTheLargestElementOfArray {
    public static void main(String[] args)
    {                                                //binary  //octal
        int [] arr = {10,20,40,60,10,32,0,45,15,72,95,0b1111110,0237};
        System.out.println("Largest Element From Given Array is :-");
        int max = 0;
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    max = arr[i];
                }
                else {
                    max= arr[j];
                }
            }
        }
        System.out.println("Maximum ELement is "+max);
    }
}
