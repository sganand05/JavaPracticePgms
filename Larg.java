
import java.util.*;
class Larg
{
	public static void main(String[] args)
	{
	int[] arr={3,4,8,0,4,9};
	int sum=0,big=0;
	for(int i=0;i<arr.length-1;i++)
		{
			sum=arr[i]+arr[i+1];
			if (big<sum)
			{
				big=sum;
			}

		}
		System.out.println(big);
	}
}