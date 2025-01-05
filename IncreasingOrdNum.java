// check whether given number is in increasing order or not 
import java.util.Scanner;
public class IncreasingOrdNum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter value:");
        int num=sc.nextInt();
        
System.out.println(isRaisisng(num));// consuming return stmt        
        
    }
    public static boolean isRaisisng(int num){
         int max=9;
        while (num>0) { 
            int rem=num%10;
            if (rem<=max) 
                max=rem;
            
            else
                return  false ;
            
            num=num/10;
        }
        return true;
    }
    
}
