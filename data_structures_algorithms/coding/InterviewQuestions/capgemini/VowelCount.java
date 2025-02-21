package coding.InterviewQuestions.capgemini;
import java.util.Set;

public class VowelCount {

    public static void main(String[] args) {
        System.out.println(Solution("adityasharma is great guy"));
    }

    private static long Solution(String string){
        Set<Character> vowels = Set.of('a' ,'i' , 'o' , 'u' , 'e');

        Long count  =  string.chars()
            .filter(ch -> !Character.isWhitespace(ch))
            .filter(c -> vowels.contains((char) c)).count();

        return (long)count;
    }

}
