package arrays;

public class FindSmallestElementfromArray {
    public static void main(String[] args) {
        int [] arr = {10,20,5,2,3,1,10,25};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Minimum Element Form Given Array is : "+min);
    }
}
