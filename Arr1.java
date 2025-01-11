
import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int[] arr=new int [5];
     int[] arr1={1,2,3,4,5};
     int sum=0;
     for (int x : arr1) {
        sum+=x;

        System.out.println(sum);
        
    }
     System.out.println("Enter array value:");
     // getting input from user
     for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
         
     }
//printing elements of array
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    
}
