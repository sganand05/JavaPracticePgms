
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter num:");
    int num=sc.nextInt();
    chk(num);

    }
    public static void chk(int num){

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i+j==num+1) {
                    
                    System.out.println("* ");
                }
                
            }
            System.out.println();
            
        }
    }

    
}
