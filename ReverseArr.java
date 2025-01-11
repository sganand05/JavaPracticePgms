// Reverse Element of Array
import java.util.Arrays;

public class ReverseArr {
    static int[] sort(int[] arr){
        int start=0;
        int end=arr.length-1;
        
            while (start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
                
            }
            
        
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5,6};
        int [] arr1={4,5,6,7,8,9,2};
        System.out.println(Arrays.toString(sort(arr1)));
        
    }
    
}
