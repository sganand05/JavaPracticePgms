public class Pyramid2 {
    public static void main(String[] args) {
        int rows=5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j =1; j<=rows-i; j++) {
                System.out.print(" ");
            }
            // Print stars
            //char ch='A';
            //int a=1;
            for (int k = 1; k <=i; k++) {
                // if (i%2==0) {
                //     System.out.print(ch+" ");
                // ch++;
                    
                // }
                // else{
                //     System.out.print(a+" ");
                //     a++;
                // }
                
                
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
        for (int i = rows-1; i>=1; i--) {
            
            // for j loop for printing spaces in columns
            for (int j =rows; j >=i-rows+rows+1; j--) {
                System.out.print(" ");
            }
            // for k loop for printing elements "*"
            for (int k = 1; k <=i; k++) {
                
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
        
    }
    
}
