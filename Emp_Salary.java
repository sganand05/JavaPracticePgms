import java.util.Scanner;
class Emp_Salary 
{
	public static void main(String[] args) 
	{
		
		salaryCal();
	}
	public static void salaryCal(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary amount for monthly:");
		int amtSalary=sc.nextInt();
		System.out.println("Enter Current year of working:");
		int currentYear=sc.nextInt();
		System.out.println("Enter joined year :");
		int joinedYear=sc.nextInt();
		if ((currentYear-joinedYear)>=3)
		{
			
			if (amtSalary<=10000)
		{
			double hRA=amtSalary*0.2;
			double dA=amtSalary*0.8;
				System.out.println("Gross salary permonth:"+(amtSalary+hRA+dA+2500));
		}
		else if (amtSalary<=20000)
		{
			double hRA=amtSalary*0.25;
			double dA=amtSalary*0.9;
				System.out.println("Gross salary permonth:"+(amtSalary+hRA+dA+2500));
		}
		else if (amtSalary>20000)
		{
			double hRA=amtSalary*0.3;
			double dA=amtSalary*0.95;
				System.out.println("Gross salary permonth:"+(amtSalary+hRA+dA+2500));
		}
		}
		else
		{
			if (amtSalary<=10000)
		{
			double hRA=amtSalary*0.2;
			double dA=amtSalary*0.8;
				System.out.println("Gross salary permonth:"+(amtSalary+hRA+dA));
		}
		else if (amtSalary<=20000)
		{
			double hRA=amtSalary*0.25;
			double dA=amtSalary*0.9;
				System.out.println("Gross salary permonth:"+(amtSalary+hRA+dA));
		}
		else if (amtSalary>20000)
		{
			double hRA=amtSalary*0.3;
			double dA=amtSalary*0.95;
				System.out.println("Gross salary permonth:"+(amtSalary+hRA+dA));
		}
			
		}




	}
}
