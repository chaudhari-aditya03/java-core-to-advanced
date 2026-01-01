package arrays;

public class ArrayDeclarationAndInitilization {
    public static void main(String[] args)
    {
        int [] arr; //Declaration
        arr = new int [10];//Memory Allocation
        arr[0] = 1;//Initilization
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int[] arr2 ={10,20,30,40,50};//declaration+initilization
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
