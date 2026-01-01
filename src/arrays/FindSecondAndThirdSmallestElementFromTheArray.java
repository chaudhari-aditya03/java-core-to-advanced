package arrays;

public class FindSecondAndThirdSmallestElementFromTheArray {
    public static void main(String[] args) {
    int [] arr ={10,20,5,2,3,1,10,25};
    int Min =Integer.MAX_VALUE;
    int SecondMin = Integer.MAX_VALUE;
    int ThirdMin = Integer.MAX_VALUE;
    for(int i = 0;i<arr.length;i++){
        if(arr[i]<Min)
        {
           ThirdMin = SecondMin;
           SecondMin = Min;
           Min = arr[i];
        }
        else if(arr[i]>Min && arr[i]<SecondMin){
            ThirdMin = SecondMin;
            SecondMin = arr[i];
        }
        else if(arr[i]>SecondMin && arr[i]<ThirdMin){
            ThirdMin = arr[i];
        }
    }
        System.out.println("First Smalles Element is : "+Min);
        System.out.println("Second Smalles Element is : "+SecondMin);
        System.out.println("Third Smalles Element is : "+ThirdMin);
    }
}
