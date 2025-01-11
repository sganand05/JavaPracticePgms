// Fibnocci Series
import java.util.Scanner;

public class Fibnocci {
    public static void main(String[] args) {
        fibo();
        
    }
    public static void fibo(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
        System.out.println("invalid input");
    return;
}
        
        int prev1=1;
        int prev2=0;
        
        System.out.println(prev2);
         if(n==1)
         return;
        System.out.println(prev1);

            
        
       
        for (int i = 3; i <=n; i++) {
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
            System.out.println(curr+" ");
            
        }

        }




    }
    

