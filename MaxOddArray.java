class MaxOddArray{
	public static void main(String[] args){
		int[] arr={12,34,56,1,34,52,23,35};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if (arr[i]%2==1) {
				if(arr[i]>max)
				max=arr[i];
				
			}
				
		}
		
		
		System.out.println("Max is "+max);
	}
}