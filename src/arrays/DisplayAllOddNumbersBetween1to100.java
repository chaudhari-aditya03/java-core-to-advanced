package arrays;

public class DisplayAllOddNumbersBetween1to100 {
    public static void main(String[] args)
    {
        System.out.println("Odd Numbers Between 1 to 100 is :-");
        int i =1;
        while(i<=100)
        {
            if(i%2!=0)
            {
                System.out.print(i+",");
            }
            i++;
        }
    }
}
