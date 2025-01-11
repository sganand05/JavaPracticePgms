class MinEvenArray{
	public static void main(String[] args){
		int[] arr={40,34,56,1,34,56,23};
		int min=arr[0];
		for(int i=0;i<arr.length;i+=2){
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Min is "+min);
	}
}