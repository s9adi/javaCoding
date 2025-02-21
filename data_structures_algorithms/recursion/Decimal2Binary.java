package recursion;

public class Decimal2Binary {

    public static void main(String[] args) {
        System.out.println(Solution(16));
    }

    private static int Solution(int n){
       if (n ==  0){
        return 0;
       }

       return Solution(n/2)*10+ n % 2 ;
}
}