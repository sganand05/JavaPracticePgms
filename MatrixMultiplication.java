
import java.util.Arrays;

public class MatrixMultiplication {
    static int[][] matMulti(int[][] arr1,int[][] arr2){
        int[][]res=new int[3][3];
        for (int i = 0; i <arr1.length; i++) {
            for (int j = 0; j <arr1[i].length; j++) {
                int sum=0;
                for (int k=0;k<arr1[i].length;k++){
                    sum=sum+(arr1[i][k]*arr2[k][j]);

                }
                
                res[i][j]=sum;
                
            }
            
        }
        return res;

    }




    public static void main(String[] args) {
        int[][] arr1={{1,1,1},{2,2,2},{3,3,3}};
        int[][] arr2={{1,1,1},{2,2,2},{3,3,3}};
       int[][] res = matMulti(arr1, arr2);
       for(int[] x:res){
        System.out.println(Arrays.toString(x));
       }
        
    }
 
}
