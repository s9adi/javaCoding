package coding.InterviewQuestions.capgemini;

import java.util.HashSet;
import java.util.Set;

public class StringManipulation {

    // Java Code for string manipulation and finding distinct characters in String.

    public static void main(String[] args) {
        Solution("Aditya");
    }

    private static void Solution(String string){
        char[] charArray = string.toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();
        
        for (int i = 0 ; i < charArray.length ; i++){
            if (!(set.contains(charArray[i]))){
                set.add(charArray[i]);
            }else {
                System.out.println(charArray[i]);
            }
        }
    }

    // private static void SOlutionUsingStreamAPI(String string){
    //     LinkedHashSet set = new LinkedHashSet<>();
    //     string.chars().filter(x -> !Character.isWhitespace(ch)).
    // }

}
