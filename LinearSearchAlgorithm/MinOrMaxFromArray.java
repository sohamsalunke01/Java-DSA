package LinearSearchAlgorithm;

import java.util.Arrays;

public class MinOrMaxFromArray {
    public static void main(String[] args) {
        int a[]={4,6,9,8,2,-4,0,98,-78,2,6,-4,15};
        System.out.println("Minimum of array "+ Arrays.toString(a)+" is ="+findMinInArray(a));
        System.out.println("Maximum of array "+Arrays.toString(a)+" is ="+findMaxInArray(a));
    }
    static int findMinInArray(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int findMaxInArray(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++ ) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

}
