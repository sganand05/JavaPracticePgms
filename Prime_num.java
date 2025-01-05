
import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        

       
        int count=1;
        for (int i = 2; i <=num; i++) {
            if (num%i==0)
            count++;
            
        }
        if (count==2) {
            for(int i=1;i<=num;i++){
                if(num%i==0){
                  System.out.println("Factors of number:"+i);
                }
                      
                  
                }
            System.out.println(num+" is prime");}
            else{
                for(int i=1;i<=num;i++){
                    if(num%i==0){
                      System.out.println("Factors of number:"+i);
                    }
                          
                      }
                System.out.println(num+"  is  not prime ");
            }
            
        }
    }


    
    

