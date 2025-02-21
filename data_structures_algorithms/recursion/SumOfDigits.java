package recursion;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(method(111));
    }

    public static int method(int n) {
        if (n<0){
            return 0;
        }
        if (n==0){
            return 0;
        }
        return n%10 + method(n/10) ;
    }
}
