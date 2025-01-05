
import java.util.Scanner;

public class Palindrome_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num value:");
        int num=sc.nextInt();
        int og=num;
        int rev=0;
       while ( num>0) { 
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        
   }
   if (rev==og) {
       
    System.out.println("Given number is palindrome");
}
else {
 System.out.println(" given number is not palindrome");
}
   
    }

}