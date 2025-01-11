
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        sort();
        
    }
    public static void sort(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        //int[] arr={3,6,2,7,1};
        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                    
                    
                
                }
            
            }
           
            
        }
        
        System.out.print("Sorted Array: "+Arrays.toString(arr)+" ");
    }
    
}
