class Avg2HalfArray{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8};
		double sum=0;
		double count=0;
		int mid=arr.length/2;
		for(int i=mid;i<arr.length;i++){
			sum+=arr[i];
			count++;
		}
		System.out.println("The Avg value of Second half of the Array is "+(sum/count));
	}
}