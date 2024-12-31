import java.util.Scanner;
class Vowels 
{
	public static void main(String[] args) 
	{
		
		chk();
	}
	public static void chk(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char :");
		char c=sc.next().charAt(0);
		if ((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
			System.out.println("Vowels");
		}else{
			System.out.println("consonant");
		}
	}
}
