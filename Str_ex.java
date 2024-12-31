import java.util.Scanner;
class Str_ex
{
	public static void main(String[] args) 
	{

			float res=avg(2,3,4,5);
			System.out.println(res);
			avg(45);
			str();
		}
		
		
		static float avg(float ...nums){
			
			float total=0;
			for(float i:nums){
				total+=i;
				}
				float res=total/nums.length;
				return res;
		}
		





 public static void str(){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String org=sc.next();
		System.out.println("original String   "+org);

		StringBuilder sb=new StringBuilder(org);//lang package--> StringBuilder class--> reverse method
		sb.reverse(); 
		System.out.println("Reversed string  "+sb);
		
		
		String rev=sb.toString();
		if (org.equals(rev))
		{
			System.out.println("given String is palindrome");
		}
		else{
			System.out.println("Given string is not palindrome");
		}

		String str="Hello world";// given string
		 rev="";//using empty string

		for (int i=str.length()-1; i>=0;i-- )//looping stmt for printing value for string
		{
			rev+=str.charAt(i);//rev=rev+str.charAt(i)==>rev=""+str.charAt(7)===>rev=""+d
		}
		System.out.println(rev);//printing stmt
 }
 }



	
	

