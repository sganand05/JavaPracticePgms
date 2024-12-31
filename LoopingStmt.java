import java.util.Scanner;

class LoopingStmt 
{
	public static void main(String[] args) 
	{
		//chk();
		atmPin();
		


	}
	public static void chk(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter table number:");
		int num=sc.nextInt();
		int i=1;
		System.out.println("Enter upto number :");
		int num1=sc.nextInt();
		while (i<=num1)//condition less than equal to 10
		{
			int res=0;
			 res=num+i;// perform sum
			System.out.println(num+ "+"+i+"="+res);
			i++;
			
		}
  


	}
	public static void atmPin(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid ATM pin:");
		int pin=sc.nextInt();
		final int  fpin=5677;
		
			int i=0;
			while (i<=5)
			{
				if (pin==fpin)
		{
			System.out.println("valid");
			continue;

		}else{
				System.out.println("Enter reagain pin");
				continue;
			}
		}i++;
		


	



}
}
