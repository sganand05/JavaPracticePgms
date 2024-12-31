
import java.util.*;
class Arr_hw
{
	public static void main(String[] args) 
	{
	// user input 
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n number of array:");
	// get input size from user 
	int n=sc.nextInt();
	int[] arr=new int[n];
	for (int i=0;i<arr.length;i++ )// looping for array for size 
	{
		arr[i]=sc.nextInt();//getting input array from user 
		
	}
	int sqr,val;//variable declaration
	for (int i=0;i<arr.length ;i++ )//printing array
	{
		val=arr[i];//storing array values in val block of memory
		sqr=val*val;//squaring val block of values and store it in sqr
		System.out.println(" array of :  "+arr[i]+"  value  "+sqr);// printing statement 
	}
	arr1();
	arr2();
	}
	public static void arr1(){
	 
	 int[] arr={2,3,8,9,4,1};
	 //initialize max and min 
	 int max=arr[0];
	 int min=arr[0];
	 //Traverse and do check condition
	 for (int i=1;i<arr.length ;i++ )
	 {
		 if (max<arr[i])
		 {
			 max=arr[i];
		 }
		 if (min>arr[i])
		 {
			 min=arr[i];
		 }
	 }
	 System.out.println("maximum element:"+max);
	 System.out.println("minimum element:"+min);
	}
	public static void arr2(){
	 
int[] arr={2,3,8,9,4,1};
System.out.println("Given arry:"+Arrays.toString(arr));
// defining mark of start and end value
int start=0;
int end=arr.length-1;
while (start<end)
{
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	start++;
	end--;
}
System.out.println("Reversed array:"+Arrays.toString(arr));
	}

	
	

	}

