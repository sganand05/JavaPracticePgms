
import java.util.Arrays;

public class SortFirsthalfAndSecondHalfAvg {
    static int[] sort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                
            }
            
        }
        return arr;
    }

static void avg(int[] arr1){

    int sum1=0;
        for (int i = 0; i < arr1.length/2; i++) {
            sum1+=arr1[i];
            
        }
        int avg1=sum1/(arr1.length/2);
        System.out.println("Avg of first half of Array  "+avg1);

        int sum2=0;
        for (int i =arr1.length/2; i < arr1.length; i++) {
            sum2+=arr1[i];
            
        }
        int avg2=sum2/(arr1.length/2);
        System.out.println("Avg of second half of Array  "+avg2);

}
    
    public static void main(String[] args) {
        int[] arr1={2,3,4,1,2,5,0,2};
        int[] res=sort(arr1);
        System.out.println(Arrays.toString(res));
        avg(arr1);
        
        
    }
    
}
