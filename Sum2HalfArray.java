class Sum2HalfArray{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8};
		int mid=arr.length/2;
		int sum=0;
		for(int i=mid;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("The Sum of 2nd Half of the Array is "+sum);
	}
}