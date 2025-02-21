package coding.practice;

import java.util.HashSet;


public class VowelInSubstring {
public static void main(String[] args) {
    Solution("abcdeioughkl");
}

private static void Solution(String string){
    // abc = abdaeiou

    /*
     * we have to find the substring that contains all the wovels
     * 
     */

    StringBuilder output = new StringBuilder();
    HashSet<Character> set = new HashSet<>();
    int count= 0;
    set.add('a') ; set.add('e') ; set.add('o'); set.add('u') ; set.add('i');
    int i = 0 ;
    while(count<5 && i < string.length()){
        char ch = string.charAt(i);
        if (set.contains(ch) && count <5){
            count++;
            set.remove(ch);
            
        }
        output.append(ch);
        i++;
    }
    while (count == 5){
        
    }

    System.out.println(output.toString());


    
    
}

// private static boolean isVowel(char c) {
//     if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'i' && c != 'I' 
//         && c != 'o' && c != 'O' && c != 'u' && c != 'U') {
//         return false;
//     }
//     return true;
// }


}
