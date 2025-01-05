
import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num value:");
        int num=sc.nextInt();
        //int sum=1;
        // while ( num>0) { 
        //      int rem=num%10;
        //      sum*=rem;
        //       num=num/10;
        // }
        // System.out.print(sum);


    //     while ( num>0) { 
    //         int rem=num%10;
    //         sum*=rem;
    //          num=num/10;
    //    }

       int rev=0;
       while ( num>0) { 
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
   }
   System.out.println("Reversed number:"+rev);
    }
    
}
