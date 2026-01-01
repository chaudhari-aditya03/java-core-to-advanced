package arrays;

public class PrintAllElementsAtOddIndices {
    public static void main(String[] args) {
        int [] arr = new int[101];
        for(int i =1;i<=100;i++)
        {
            arr[i]=i;
        }
        for(int i =1;i<=100;i++)
            if(i%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
    }
}
