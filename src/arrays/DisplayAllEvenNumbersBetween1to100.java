package arrays;

public class DisplayAllEvenNumbersBetween1to100 {
    public  static  void main(String[] args)
    {
        System.out.println("Even Numbers Between 1 to 100 is :-");
        for(int i = 1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+",");
            }
        }
    }
}
