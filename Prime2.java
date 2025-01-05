 // first 30 prime numbers
 public class Prime2 {
    public static void main(String[] args) {
        int primeCount=0;
        int num=2;
        while (primeCount!=5) {
            if (checkPrime(num)) {
                System.out.println(num+" ");
                primeCount++;
                
            }
            num++;
            
        }
            
        }
    public static boolean checkPrime(int num){

            int count=0;
            for (int i = 1; i <=num; i++) {
                if (num%i==0) {
                    count++;
                    
                }
                
            }
            if (count==2) {
                return true;
                
            } else {
                return false;
            }

        }
    }
    

