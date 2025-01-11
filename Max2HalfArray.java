class Max2HalfArray{
	public static void main(String args[]){
		int[] arr={1,7,6,5,5,6,7,8};
		int mid=arr.length/2;
		int max=arr[mid];
		for(int i=mid;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The Max of the Array from 2nd Half is "+max);
	}
}