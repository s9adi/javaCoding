package coding.InterviewQuestions.capgemini;

public class LowerCaseUpperCase {

    // convert first half to lower case and second half in upper case 

    public static void main(String[] args) {
        String string = "Aditya Sharma is great guy" ;
        Solution(string);
    }

    private static void Solution(String string){
        StringBuilder output = new StringBuilder();
        int len = string.length();
        output.append(string.substring(0, len/2).toLowerCase());
        output.append(string.substring(len/2 , len).toUpperCase());

        System.out.println(output.toString());
    }

}
