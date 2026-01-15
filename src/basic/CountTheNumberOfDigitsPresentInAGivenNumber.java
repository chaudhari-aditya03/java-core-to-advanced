package basic;

import java.util.Scanner;

public class CountTheNumberOfDigitsPresentInAGivenNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int a= n;
        int count =0;
        int num = 0;
        while(n>0)
        {
            num = n%10;
            count++;
            n = n/10;
        }
        System.out.println(a+" contains "+count+" Digits");
        sc.close();
    }
}
