package recursion;

public class reverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Aditya"));
    }

    public static String reverse(String string){
        // we have to update the same reference
        // it increases the overhead

        // we update the refrence in each iteration 
        // for eg -  string is abc -> it should be cba

        // backtracking 
        
        if(string.isEmpty()){
            return string;
        }

        return reverse(string.substring(1) )  + string.charAt(0) ;
    }

}
