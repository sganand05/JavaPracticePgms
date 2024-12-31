
import java.util.*;
class Arr_hw2 
{
	public static void main(String[] args) 
	{
	int i,k;	
	Scanner sc1=new Scanner(System.in);
	System.out.print("Enter n1 number of array:");// get input size from user 
	int n1=sc1.nextInt();
	int[] arr1=new int[n1];
	for ( i=0;i<n1;i++ )// looping for array for size 
	{
		arr1[i]=sc1.nextInt();//getting input array from user 
		
	}
	Scanner sc2=new Scanner(System.in);
	System.out.print("Enter n2 number of array:");// get input size from user 
	int n2=sc2.nextInt();
	int[] arr2=new int[n2];
	for ( k=0;k<n2;k++ )// looping for array for size 
	{
		arr2[k]=sc2.nextInt();//getting input array from user 
		
	}
	
for (i=0;i<n1;i++ )// first  loop enter in array 1
{
	for (k=0;k<n2;k++ )// inside check second array 
	{
		if (arr1[i]==arr2[k])//if element arr1==arr2 
		{
			System.out.println("common elements in both array:"+arr1[i]);//print common elements from both
			break;
		}
		else{
			System.out.println("NO common elements:");
			break;
			
		}
	}
}

	}
}