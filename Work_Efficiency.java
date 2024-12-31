import java.util.Scanner;
class Work_Efficiency 
{
	public static void main(String[] args) 
	{
		work();
		
	}
	public static void work(){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee name:");
		String name=sc.nextLine();
		System.out.println("Enter working hours of employee");
		double wk_hrs=sc.nextInt();
		if (wk_hrs<=3)
		{
			System.out.println("Worker is highly efficient");
		}
		else if (3<wk_hrs&&wk_hrs<=4)
		{
			System.out.println("Worker is need to improve speed");
		}
		else if(4<wk_hrs&&wk_hrs<=5){
			System.out.println("worker is given training to improve speed");
		}
		else{
			
			System.out.println("Worker has to leave the company");
		}
	}
}
