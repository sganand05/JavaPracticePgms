public class Ptrn {
    public static void main(String[] args) {
        char ch1='A';
        for (int i = 1; i <=5; i++) {
            char ch='A';
           
            for ( int j = 1; j <=i; j++) {
                if (i==j) {
                    System.out.print(" "+ch);
                  
                }
                
                else{
                    System.out.print(" "+ch1);
                    
                }
                ch++;
                
                ch1++;
               
                System.out.print("  ");
                
            }
            
            System.out.println();
            
        }
        

        
    }
    
    
}
