package arrays;

public class PrintElementsAtEvenIndices {
    public static void main(String[] args) {
        int [] arr = new int[100];
    for(int i =0;i<=100;i++)
    {
        arr[i]=i;
    }
    for(int i =0;i<=100;i++)
        if(i%2==0)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
