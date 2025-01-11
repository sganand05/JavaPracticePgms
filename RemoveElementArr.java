import java.util.Arrays;

public class RemoveElementArr {
    public static void main(String[] args) {
        int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 }; 
        System.out.println("Original Array:"+Arrays.toString(a));
        int k = 3; 
        a = removeElements(a, k); 
        System.out.println(Arrays.toString(a)); 
        

    }
    public static int[] removeElements(int[] a, int k) 
    { 
        // Move all other elements to beginning 
        int index = 0; 
        for (int i=0; i<a.length; i++) 
            if (a[i] != k) 
                a[index++] = a[i]; 

        // Create a copy of arr[] 
        return Arrays.copyOf(a, index); 
    } 
    
}
