class OddSumArray{
	public static void main(String args[]){
		int[] arr={45,2,34,3,76,4,49,5};
		int sum=0;
		for(int i=1;i<arr.length;i+=2){
			sum+=arr[i];
		}
		System.out.println("The Sum of Odd Indexed Elements is "+sum);
	}
}