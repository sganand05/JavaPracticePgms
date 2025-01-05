import java.util.Scanner;
public class Pefect_sqr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
          if(num%i==0){
            sum=sum+i;
          }
        }
           if(sum==num){System.out.println("perfect Square number");}
           else{System.out.println("Non perfect square");}
          

                
            
        }
    }