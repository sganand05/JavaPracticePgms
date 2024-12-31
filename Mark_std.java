import java.util.Scanner;
class Mark_std 
{
	public static void main(String[] args) 
	{
		mark();
		mark1();
		
	}
	
	public static void mark(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter maths mark:");
		int mat=sc.nextInt();
		System.out.print("Enter science  mark:");
		int sci=sc.nextInt();
		System.out.print("Enter social science mark:");
		int soc=sc.nextInt();
		System.out.print("Enter tamil mark:");
		int tam=sc.nextInt();
		System.out.print("Enter english mark:");
		int eng=sc.nextInt();
		int total=(mat+sci+soc+tam+eng);
		System.out.println("Total mark of std: "+total);
		int avg=total/5;
		System.out.println("Average mark of std: "+avg);
		if (avg>=90)
		{
			System.out.println("Grade 'A'");
		}else if (90>avg && avg>=80)
		{
			System.out.println("Grade 'B'");
		}else if (80>avg&& avg>=70)
		{
			System.out.println("Grade 'C'");
		}else if(70>avg && avg>=60){
			System.out.println("Grade  'D'");
		}else if (60>avg)
		{
			System.out.println("Grade 'E'");
		}
	}

		public static void mark1(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		if ((num%5==0)&&(num%3==0))
		{
			
			System.out.println("Number is divisible by both 5 and 3:  ");
		}else 
			{
				System.out.println("Number is not divisible by 5 and 3");
			}
		
		

		

	}
}
