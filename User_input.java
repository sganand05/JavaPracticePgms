
import java.util.Scanner;
class User_input 
{
	public static void main(String[] args)
		
	{
		Scanner sc=new Scanner(System.in);// Scanner class for user input or read dynamic data
		System.out.println("enter first value:");
		int a=sc.nextInt();// mention datatype that user going to declare
		
		System.out.println("enter second value:");
		int b=sc.nextInt();
		
		int res=Math.max(a,b);
		System.out.println("maximum value:"+res);


		
	}
}
