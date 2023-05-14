package LinearSearchAlgorithm;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
    int [][] arr={
            {15,36,9,6,-7},
            {5,9,0,6},
            {1,2,-8,4,10},
            {69,87,2,-3,5}
        } ;
        int target=1;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(search2DArray(arr,target));
        System.out.println("Max in Array= "+maxValue(arr));
        System.out.println("Min in Array= "+minValue(arr));
    }
    static String search2DArray(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return "Array ["+row+"]["+col+"]="+target;
                }
            }

        }
        return "Not found......!!!!!!!!";
    }

    static int maxValue(int [][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] row:arr){
            for(int col:row){
                if(col>max){
                    max=col;
                }
            }
        }
    return max;
    }
    static int minValue(int [][] arr){
        int min=Integer.MAX_VALUE;
        for(int[] row:arr){
            for(int col:row){
                if(col<min){
                    min=col;
                }
            }
        }
        return min;
    }

}
