package arrays;

import java.util.Scanner;

public class AvgOfAllElementsOfArray
    {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<num;i++)
        {   arr[i]=sc.nextInt();
        }
        int sum =0;
        for(int i =0;i<num;i++)
        {
            sum = sum+arr[i];
        }
        int Avg = sum/num;
        System.out.print("Avg Of ALL Elements of Array is : "+Avg);
        sc.close();
    }
}
