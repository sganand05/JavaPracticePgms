
import java.util.Arrays;

public class RotateArr {
    public static void rtd(){

        int[] arr={10,20,30,40,50};
        int temp=arr[arr.length-1];
        int rot=3;
        int k=1;
        
           while (k<=rot) {
            for (int i =arr.length-1; i>=0; i--) {
            
                if (i==0) {
                        arr[i]=temp;
              }else{
                    arr[i]=arr[i-1];
    
                }
           
            
        }
            k++;
           }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        rtd();
        
    }
    
}
