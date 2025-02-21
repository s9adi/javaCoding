package coding.InterviewQuestions.capgemini;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersinRange {

    public static void main(String[] args) {
        Solution();
    }

    private static void Solution(){
        // if the number is divisible by itself

        // range 10 to 50 
        List<Integer> list = new ArrayList<>();

        for (int i = 10 ; i < 50 ; i++){
            if (isPrime(i)){
                list.add(i);
            }
        }

        System.out.println(list);
        
    }
    private static boolean isPrime(int integer){
        for (int i = 2 ; i < integer ; i++){
            if (integer%i ==0){
                return false;
            }
        }

        return true;
    }

}
