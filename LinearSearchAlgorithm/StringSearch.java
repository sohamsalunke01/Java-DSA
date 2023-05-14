package LinearSearchAlgorithm;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
       String name="Soham";
       char tr='m';
        System.out.println(searchString(name,tr));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean searchString(String str,char target){
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
        System.out.println("index = "+i);
                return true;
            }
        }
//        for(char ch: str.toCharArray()){
//            if(ch==target){
//
//                return true;
//            }
//        }
        return false;
    }
}
