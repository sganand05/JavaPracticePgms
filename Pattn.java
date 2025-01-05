
import java.util.Scanner;

public class Pattn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value :");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            char ch='A';
            
            for (int k = 1; k <= num; k++) {
                if(i%2==1){
                System.out.print(i);
           }else{
                System.out.print(ch);
                ch++;
                
                
                
            }
            
            }
            System.out.println();

        }
        
        

    }
    
}
