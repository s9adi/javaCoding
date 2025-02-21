package coding.InterviewQuestions.KPMG;

import java.util.HashMap;
import java.util.Map;



public class ExpandString {

    public static void main(String[] args) {
        Solution("w4a3d1e1x6");
    }

    private static void Solution(String string){
        String string1 = string.toLowerCase();
        
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0 ; i < string.length() ; i++){
            char ch = string.charAt(i);
            if (i+1 < string.length() &&Character.isDigit(string.charAt(i+1))){
                int count = 0 ;

                while(i+1< string.length() && Character.isDigit(string.charAt(i+1))){
                    count = count*10 + (string.charAt(i+1) - '0' ); 
                            // this makes the second place value available  
                            // and by sybstracting the string with 0(ascii) value gives the original value
                    i++;

                }
                stringbuilder.append(String.valueOf(ch).repeat(count));
            }
        }

        System.out.println(stringbuilder.toString());
    }

    private static void Solution2(String string){

        // using HashMap

        Map<Character, Integer> map = new HashMap<>();
        
    }


}


