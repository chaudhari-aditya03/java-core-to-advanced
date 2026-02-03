package practice;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n)
    {
        for(int i = 2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Check the Number is Prime or Not ----");
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(isPrime(num)==true)
        {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}
