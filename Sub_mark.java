
// find total and average marks of student of 5 subject 
class  Sub_mark
{  

	public static void main(String[] args) 
	{
		System.out.println("find total and average of  5 subject marks out of 100");
		int tam=89,eng=78,mat=87,sci=69,soc=80;
		int sum_sub=tam+eng+mat+sci+soc;
		double avg_sub=sum_sub/5;
		System.out.println("tamil:"+tam+"\nenglish:"+eng+"\nmaths:"+mat+"\nscience:"+sci+"\nsocial:"+soc);//"\n" follows new line in printing statement 
		System.out.println("total marks of a student out of 500 is:"+sum_sub);
		System.out.println("average marks of a student for each subject:"+avg_sub);
		
	}
}
