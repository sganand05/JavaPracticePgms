class AvgOddArray{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8};
		double sum=0;
		double count=0;
		for(int i=1;i<arr.length;i+=2){
			sum+=arr[i];
			count++;
		}
		System.out.println("The Avg value of all Odd Index elements is "+(sum/count));
	}
}