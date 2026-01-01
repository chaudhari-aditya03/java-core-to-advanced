package arrays;

public class FindSecondLargestElementOfArray {
    public static void main(String[] args) {
        int[] arr ={20,60,1200,65,78,901,1050,1051,1600};
        int Largest= Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        int ThirdLargest = Integer.MIN_VALUE;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>Largest){
                ThirdLargest= SecondLargest;
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i]<Largest && arr[i]>SecondLargest){
                ThirdLargest = SecondLargest;
                SecondLargest = arr[i];
            }
            else if(arr[i]<SecondLargest && arr[i]>ThirdLargest){
                ThirdLargest = arr[i];
            }
        }
        System.out.println("Largest Element From Given Array is :"+Largest);
        System.out.println("Second Largest Element is :"+SecondLargest);
        System.out.println("Third Largest Element is :"+ThirdLargest);
    }
}
