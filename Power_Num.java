import java.util.Scanner;


public class Power_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter base:");
        int base=sc.nextInt();
        System.out.print("power value:");
        int pwr=sc.nextInt();
        int res=1;
        // double  res=  Math.pow(2, 208);
        for (int i = 1; i <=pwr; i++) {
           res*=base;
        }
        System.out.println("result value:"+res);
        // BigInteger res1=BigInteger.valueOf(2).pow(208);
        // System.out.println(res1);


    }
}
