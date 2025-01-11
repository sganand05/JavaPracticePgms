public class ArrMin {

    public static void main(String[] args) {
        int[] arr={2,3,4,1,5,8,6,-1};
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(min>arr[i])
            min=arr[i];
            if(max<arr[i])
            max=arr[i];
            
        }
        System.out.println("Min value element from arr:"+min);
        System.out.println("Max value element from arr:"+max);
        
    }
}