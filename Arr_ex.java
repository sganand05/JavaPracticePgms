//display index value of elements in Array
import java.util.*;

class Arr_ex 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);//get input form user 

		int n=sc.nextInt();//user can define size of array
		int[] arr=new int[n];

		// input value for array
		for (int i=0;i<arr.length;i++ )
		{
			arr[i]=sc.nextInt();
		}
		// output printing statement
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println("Index of arr"+i+"  value is: "+arr[i]);

		}
		// linear search of key value 
		 System.out.print("Enter value to be search:");
		 int key=sc.nextInt();
		
		 int ans=-1;// initial default value -1 impossible to get index for unavailable element
		 
		//searching in loop
		 for (int i=0;i<n ;i++ )
		 {
			 if (arr[i]==key)
			 {
				ans=i;// assign value to var ans
			break;
				
				

			 }
			
		 }
		 System.out.println("index position is:"  +ans+ "  of  "+key);
		 
	}
}
