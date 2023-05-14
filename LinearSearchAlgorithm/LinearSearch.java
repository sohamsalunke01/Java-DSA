package LinearSearchAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={18,12,9,14,65,-8,36,4};
        int target=4;
        int ans=linearSearch(a,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
