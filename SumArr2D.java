
import java.util.Arrays;


public class SumArr2D {
    public static void main(String[] args) {
        int[][] res=sum();
        for(int[] a:res){
            System.out.println(Arrays.toString(a)+" ");
        }
          
    }
    public static int[][] sum(){
        int[][] arr1={{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr2={{1,2,3},{1,2,3},{1,2,3}};
        int[][] res=new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr1[0].length; j++) {
                res[i][j]=arr1[i][j]+arr2[i][j];
                
            }
            
        }
        return  res;

    }
    
}
