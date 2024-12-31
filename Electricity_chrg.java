
import java.util.Scanner;
class Electricity_chrg 
{
	public static void main(String[] args) 
	{
		bill();
	}
	public static void bill(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit of electricity: ");
		int unit=sc.nextInt();
		if (unit<=50)
		{
			double total=(unit*0.5);
			System.out.println("Total amount of first 50 units: "+total+"Rs");
		}
		else if ((unit>50)&&(unit<=150))
		{
			double total=unit*0.75;
			System.out.println("Total amount of 51 to 150 units :"+total+"Rs");
		}
		else if ((unit>151)&&(unit<=250))
		{
			double total =unit*1.20;
			System.out.println("Total amount of 151 to 250 units:  "+total+"Rs");
		}
		else{
			double tot=(unit*1.50);
			double add_sur=tot*0.2;
			double fin_tot=tot+add_sur;
			System.out.println("Total amount of above 250 units: "+fin_tot+"Rs");


		}

	}
}
