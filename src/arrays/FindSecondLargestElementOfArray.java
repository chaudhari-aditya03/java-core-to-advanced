package arrays;

public class FindSecondLargestElementOfArray {
    public static void main(String[] args) {
        int[] arr ={20,60,1200,65,78,901};
        int Largest=0;
        int SecondLargest = 0;
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                {
                    int temp = Largest;
                    Largest = arr[i];
                    SecondLargest = temp;

                }
                else
                {
                    int temp = Largest;
                    Largest = arr[j];
                    SecondLargest = temp;
                }
            }
        }
        System.out.println("Largest Element From Given Array is :"+Largest);
        System.out.println("Second Largest Element is :"+SecondLargest);
    }
}
