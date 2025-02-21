package coding.InterviewQuestions.capgemini;

import java.util.HashSet;

public class removeAllVowels {

    public static void main(String[] args) {
        Solution("aditya sharma");
    }

    private static void Solution(String string){
        // we have to iterate through all the string and form the string 
        // without vowels 
        HashSet<Character> set = new HashSet<>();
        set.add('a') ; set.add('e') ; set.add('o'); set.add('u') ; set.add('i');
        StringBuilder output = new StringBuilder();
        for (int i = 0 ; i < string.length() ; i++){
            char ch = string.charAt(i);
            if(!(set.contains(ch)) && ch !=' '){
                output.append(ch);
            }
        }
        System.out.println(output.toString());
    }

}
