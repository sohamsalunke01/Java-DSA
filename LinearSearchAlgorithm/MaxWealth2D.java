package LinearSearchAlgorithm;
//To check maximum wealth of bank account
public class MaxWealth2D {
    public static void main(String[] args) {
        int [][]arr={
                        {1,2,3},
                        {8,1,2},
                        {7,5,4}
                    };
        System.out.println(maxWealth(arr));
    }

    static int maxWealth(int[][] arr) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[]person:arr){
            int wealth=0;
            for(int account:person){
                wealth+=account;
            }
            if(wealth>maxWealth){
                maxWealth=wealth;
            }
        }
        return maxWealth;
    }
}
