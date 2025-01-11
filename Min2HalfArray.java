class Min2HalfArray{
	public static void main(String args[]){
		int[] arr={8,7,6,5,9,6,7,8};
		int mid=arr.length/2;
		int min=arr[mid];
		for(int i=mid;i<arr.length;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("The Min of the Array from 2nt Half is "+min);
	}
}