class ArrayMin{
	public static void main(String[] args){
		int[] arr={12,34,56,1,34,56,23};
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.print("The Min of the Array is "+min);
	}
}