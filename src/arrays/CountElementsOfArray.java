package arrays;

import java.util.Scanner;

public class CountElementsOfArray {
    static public void main(String []args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Contains "+arr.length+" elements");
        sc.close();
    }
}
