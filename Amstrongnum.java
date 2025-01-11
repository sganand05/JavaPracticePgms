public class Amstrongnum {
    public static void main(String[] args) {
       System.out.println(checkAmstrong(345));
        
    }
    static boolean checkAmstrong(int num){
        int temp = num;
        int digits = digitsCount(num);
        int sum = 0;
        while(temp>0){
            sum+=pow(temp%10,digits);
            temp=temp/10;
        }
        if(num==sum){
            return true;
        }
        else{
            return false;
        }
    }
    static int digitsCount(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static int pow(int base,int exp){
        int fact=1;
        for(int i=0;i<exp;i++){
            fact=fact*base;
        }
        return fact;
    }
        
        
    
}

