class Array2Min{
	public static void main(String args[]){
		int[] arr={23,45,76,44,28,5,35,87};
		int min=arr[0];
		int smin=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				smin=min;
				min=arr[i];
			}
			else if(arr[i]<smin && min!=arr[i]){
				smin=arr[i];
			}
		}
		System.out.println("The 2nd Min of the Array is "+smin);
	}
}