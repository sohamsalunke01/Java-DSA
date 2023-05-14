package LinearSearchAlgorithm;

public class EvenDigits {
    public static void main(String[] args) {
       int [] arr={2,98,6554,62,55,65,64,6984565,5451,6884,598,35584};
        System.out.println("Number of even Digits numbers in array is ="+findNumberDigits(arr));
        int num=-987515156;
        System.out.println("This Number "+num+" contains even digits :["+even(num)+"] ");
        System.out.println("This Number "+num+" contains Number of digits :["+digitNumber(num)+"] ");

    }

    static int findNumberDigits(int [] arr){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int digits=digitNumber(num);
        return digits%2==0;
    }

    private static int digitNumber(int num) {
        int count=0;
        if(num<0){
            num*=-1;
        }
        if(num==0){
            return 1;
        }
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    static int findD(int num){
        int count=0;
        if(even(num)){
            count++;
        }
        return count;
    }
}
