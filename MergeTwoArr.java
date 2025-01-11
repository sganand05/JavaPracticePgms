
// merge Two Arrays by Creating With the help new Array
public class MergeTwoArr {
    static int[] merge(int[] arr1,int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length; i++) {
            res[i]=arr1[i];
            
        }
        int index=0;
        for (int i = arr1.length; i <res.length; i++) {
            res[i]=arr2[index];
            index++;
            
        }
        return res;

    }
    static int[] alternateMerge(int[] arr1,int[] arr2){
        int[] res=new int[arr1.length+arr2.length];
        int index1=0;
        int index2=0;
        for (int i = 0; i < res.length; i++) {
            if (i%2==0) {
                res[i]=arr1[index1];
                index1++;
                
                
            }
            else{
                res[i]=arr2[index2];
                index2++;
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
        int[] b={2,3,4,5};
        int[] res=merge(a, b);
        int[] res1=alternateMerge(a, b);
        for(int x:res){
            System.out.print(x+" ");
        }
       // System.out.println();


        
    }
    
}
