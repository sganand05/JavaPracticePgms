
import java.util.Arrays;

public class Samp {
    static int[] sort(int[] arr){
        int start=arr[0];
        int end=arr[arr.length-1];
        for (int i = start; i <=end; i++) {
            while (start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
                
            }
            
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5,2};
        int[] res=sort(arr);
        System.out.println(Arrays.toString(res));
        
    }
    
}
