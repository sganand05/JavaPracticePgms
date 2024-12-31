import java.util.Scanner;
class Calci 
{
	public static void main(String[] args) 
	{
		cal();
	}
	public static void cal(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value:");
		double a=sc.nextInt();
		System.out.print("Enter b value:");
		double b=sc.nextInt();
		System.out.println("Addition of two numbers: "+(a+b));
		System.out.println("Subtraction of two numbers:"+(a-b));
		System.out.println("Multiplication of two numbers:"+(a*b));
		System.out.println("Division of two numbers :"+(a/b));
		System.out.println("MOdulus of two numbers:"+(a%b));

		
	}
}
