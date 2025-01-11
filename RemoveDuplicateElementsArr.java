
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElementsArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        int min=0;
        // nested loop for finding duplicate elements and reinitialize with Integer.MinValue
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j <arr.length; j++) {
                if(arr[i]==arr[j]){
                arr[j]=Integer.MIN_VALUE;
                min=arr[j];
                }

            }
           
        }
        // loop for count to reduce Array size
        int count=0;
            for(int a:arr){
                if(a==min)
                count++;


            }
            // create new array for storing new modified array
            int[] res=new int [arr.length-count];
            int index=0;
            // loop for reassigning indeces value of element
            // And store it in new res[] array
            for (int i = 0; i <arr.length; i++) {
                if (arr[i]!=min) {
                    res[index++]=arr[i];
                    
                }
                
            }
            System.out.println(Arrays.toString(res));
            sc.close();
    }
    
}
