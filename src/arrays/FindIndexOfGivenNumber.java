package arrays;

import java.util.Scanner;

public class FindIndexOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number to Find its Index : ");
        int num = sc.nextInt();
        int[] arr ={10,20,63,42,20,35,45,52,85,45};
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("The Number "+num+" is Present at "+(i)+" Index");
            }
        }
    }
}
