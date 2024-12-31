class Cond_opr 
{
	public static void main(String[] args) 
	{
		String user="Dhana";
		String pwd="nut05";
		String check=("SG"==user) && ("nut05"==pwd)?"login successfull":"Invalid credentials";
		System.out.println(check);

		int a=356772;
		String check1=(a%2==0)?"Even":"odd";
		System.out.println(check1);

		int num=34;
		String check2=(num%5==0)&&(num%3==0)?num+"  Number is divisible by both 5 and 3":+num+"  Number isn't divisible by both 5 and 3";
		System.out.println(check2);
		 
		int mark=32;
		String check3=(mark>=35)?mark+"  pass":+mark+"  fail";
		System.out.println(check3);

		boolean raining=true;
		String  check4 =(raining==false)?"Take glasses":"Take umberalla";
		System.out.println(check4);
	}
}



