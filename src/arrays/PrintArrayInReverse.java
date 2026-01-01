package arrays;

public class PrintArrayInReverse {
    public static void main(String[] args)
    {
    int arr[]={10,20,30,40,50,60,70,80,90,100};
    System.out.println("Elemets Of Arrays : ");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
        System.out.println("\nArray Elements in Reverse Order");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
