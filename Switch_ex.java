import java.util.Scanner;
class  Switch_ex
{
	public static void main(String[] args) 
	{

		chk();
	}
	public static void chk(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int a=sc.nextInt();
		
		if ((a%4==0)&&(a%400==0)||(a%100!=0))// switch(value/variable/expression)
		{
			System.out.println("year is leap year");

		}else{
			System.out.println("Not leap year");
		}
	}

		
		case 1:{
		System.out.println("Monday");
		}
		break;
		case 2:{
		System.out.println("Tuesday");
		}
		break;
		case 3:{
		System.out.println("Wednesday");
		}
		break;
		case 4:{
		System.out.println("Thursday");
		}
		break;
		case 5:{
		System.out.println("Friday");
		}
		break;
		case 6:{
		System.out.println("Saturday");
		}
		break;case 7:{
		System.out.println("Sunday");
		}
		break;
		default :{
			System.out.println("enter valid number ");
		}
		}

		
	}

