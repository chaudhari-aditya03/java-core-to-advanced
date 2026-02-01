package arrays;

public class CountNegativeNumbers
    {
    public static void main(String[] args) 
        {
        int [] arr ={2,-1,82,-95,75,0,-125,230};
        System.out.println("Number Of Positive Numbers in Given Array is : ");
        System.out.println("0 is non positive , non negative number");
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        System.out.println("Negative Numbers in Given Array is "+count);
    }
}
