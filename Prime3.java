
public class Prime3 {
    public static void main(String[] args) {
       
        chk();
        
    }
    public static void chk() {
        int vals=1;
        for (int i = 10; i <=200; i+=10) {
          vals=i-1;// before 10 multiple values
          //vals=i+1;// after 10 multiple values
          
        //   if (vals%2==0||vals%3==0||vals%4==0||vals%5==0||vals%6==0||vals%7==0||vals%8==0||vals%9==0) {
            
        //       System.out.println(vals+"not prime ");
        //   }
        //   else{
        //     System.out.println(vals+"prime ");
        //   }
                
        int count=0;
        for (int j = 2; j <=9; j++) {
            if (vals%j==0) {
                count++;
                
            }
            
            
        }
        if (count>=1) {
            System.out.println(vals+" is not prime ");
            
        }
        else{
            System.out.println(vals+" is prime number ");
        }
            }
             
         }
            
        }
        
    
    

