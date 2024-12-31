// sum of array of Two matrix a and b from user input
import java.util.Scanner; 
class Multi_arr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// need to mention number of rows and columns
		System.out.println("Enter no rows :");
		int rows=sc.nextInt();
		System.out.println("Enter no colms:");
		int cols=sc.nextInt();
		int[][] a= new int[rows][cols];//Define size of a
		int[][] b= new int [rows][cols];// Define size of b
		System.out.println("First matrix:");
		mat(a);// method calling stmt
		System.out.println("Second matrix:");
		mat(b);// mtd calling stmt
		// using third variabe to store sum of values
		int[][] c=new int[rows][cols];
		System.out.print("Sum of matrix a and b  ");
		for (int i=0;i<rows ;i++ )
		{
			for (int j=0;j<cols ;j++ )
			{
				c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
			}
		}
	}// method using to performing getting input 
	public static void mat(int[][] mat){
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<mat.length ;i++ )
		{
			for (int j=0;j<mat.length ;j++ )
			{
				mat[i][j]=sc.nextInt();
			}
		}
		

	}
}
