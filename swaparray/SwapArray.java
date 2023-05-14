package swaparray;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,87,984,5,6,7};
        int last= arr.length-1;
        int first=0;
        while(first<last) {
            reverse(arr,first,last);
            last--;
            first++;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[],int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
