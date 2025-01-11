// Check the frequency of elements in Array
import java.util.Arrays;

public class FrequencyElementsArr {
    static void countFrequency(int[] arr){
        boolean[] visited=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) // Skip already visited element
            {
                continue;
                
            }
            
        
        int count=0;
        for (int j = 0; j< arr.length; j++) {
            if (arr[i]==arr[j]) {
                count++;
                visited[j]=true;

                
            }
            
        }
        System.out.println("Element of "+arr[i]+" count is :"+count);
    }
        

    }
    public static void main(String[] args) {
        int[] arr={10,20,10,30,20};
        int[] arr2={10,20,10,30,20,20,10,40,40,20};
        System.out.println(Arrays.toString(arr));
       countFrequency(arr);
        System.out.println(Arrays.toString(arr2));
       countFrequency(arr2);
            
            
        }

        
    }
    

