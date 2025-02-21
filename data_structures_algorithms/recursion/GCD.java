package recursion;

class GCD{
    public static void main(String[] args) {
        System.out.println(Solution(8, 12));

        System.out.println(eucleadean(8,4));
    }

    private static int Solution(int x , int y){
        int z  = Math.min(x, y);
        int hcf = 0;
        for (int i = 1 ; i < z ; i++){
            if(x%i == 0 && y%i ==0){
                hcf = i;
            }
        }

        return hcf;
    }

    private static int eucleadean(int x , int y){
        if (y == 0){
            return x;
        }
        if(x < 0 || y <0){
            return -1;
        }
        return eucleadean(y, x%y);
    }
}