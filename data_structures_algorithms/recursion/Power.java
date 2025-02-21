package recursion;

public class Power {
    
    public static void main(String[] args) {
        
        System.out.println(solution(3,2));
    }

    public static int solution(int num , int power){
        if(power < 0){
            return -1;
        }
        if(power ==0){
            return num;
        }
        return num*solution(num, power-1);
    }
}
