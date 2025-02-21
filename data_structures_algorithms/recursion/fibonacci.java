package recursion;

public class fibonacci {

    public static void main(String[] args) {
        for (int i = 0 ; i< 6 ; i++){
            System.out.println(fibonacciSeries(i) + " ");
        }
    }

    public static int fibonacciSeries(int n){
        if (n == 0){
            return 0;
        }
        if (n ==1){
            return 1;
        }
        if (n<0){
            return -1;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
}
