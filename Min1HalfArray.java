class Min1HalfArray{
	public static void main(String args[]){
		int[] arr={8,7,6,5,5,6,7,8};
		int mid=arr.length/2;
		int min=arr[0];
		for(int i=0;i<mid;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("The Min of the Array from 1st Half is "+min);
	}
}