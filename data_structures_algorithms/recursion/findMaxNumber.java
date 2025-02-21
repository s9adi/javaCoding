package recursion;

public class findMaxNumber {
    public static void main(String[] args) {
        int [] array = new int[]{1,2,3,56,23,16};

        System.out.println(method(array , 6));
    }

    public static int method(int[] sampleArray , int n){
        if (n == 1){
            return sampleArray[0];
        }
        return Math.max(sampleArray[n-1] , method(sampleArray , n-1));
    }
}