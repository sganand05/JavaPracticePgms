
import java.util.Scanner;

// import java.lang.*;
// import java.util.Scanner;
// public class StarPattern {
//     public static void main(String[] args) {
//  Scanner sc= new Scanner (System.in);
//     System.out.println("Enter num:");
//     int num=sc.nextInt();
//     chk(num);

   // }
    // public static void chk(int num){

    //     for (int i = 1; i <= num; i++) {
    //         for (int j = num; j>i; j--) {
    //             for (int k = 1; k <=(2*i-1); k++) {
                    
                
                    
    //                 System.out.print("* ");
    //             }
    //             System.out.print(" ");
    //             //else{
    //               //  System.out.println();
    //           //  }
                
    //         }
    //         System.out.println();
            
    //     }
    // }
    public class PyramidPattern {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of rows:");
            int rows = sc.nextInt(); // Number of rows for the pyramid
    
            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int j =1; j<=rows-i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                char ch='A';
                int a=1;
                for (int k = 1; k <=i; k++) {
                    if (i%2==0) {
                        System.out.print(ch+" ");
                    ch++;
                        
                    }
                    else{
                        System.out.print(a+" ");
                        a++;
                    }
                    
                    
                    //System.out.print("* ");
                }
                // Move to the next line
                System.out.println();
            }
        }
    }
    
    
//}
