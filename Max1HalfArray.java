class Max1HalfArray{
	public static void main(String args[]){
		int[] arr={1,7,6,5,5,6,7,8};
		int mid=arr.length/2;
		int max=arr[0];
		for(int i=0;i<mid;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The Max of the Array from 1st Half is "+max);
	}
}