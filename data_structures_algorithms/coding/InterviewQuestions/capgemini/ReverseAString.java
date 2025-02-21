package coding.InterviewQuestions.capgemini;

public class ReverseAString {

    public static void main(String[] args) {
        Solution("sharma");
    }

    private static void Solution(String string){
        String reversed  = string.chars().mapToObj(c -> String.valueOf((char) c)).reduce("" , (a,b) -> b+a);

        System.out.println(reversed);
    }

}


