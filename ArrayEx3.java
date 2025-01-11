// Find Square of Elements in Array
import java.util.Arrays;
import java.util.Scanner;



public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Elements of array");
        for (int k = 0; k <n; k++) {
            arr[k]=sc.nextInt();
            
        }
       
        array(arr);
        
        System.out.println(Arrays.toString(arr));
        
    }
      public static int[] array(int[] arr)
      {
        //int[] res=new int[5];
        

        for (int i = 0; i <arr.length; i++) {
              arr[i]=arr[i]*arr[i];
            
        }
        return arr;

      }                 
    
}
