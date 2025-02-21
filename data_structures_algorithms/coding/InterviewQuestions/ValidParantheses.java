package coding.InterviewQuestions;

public class ValidParantheses {

    public static void main(String[] args) {
       boolean ans =  Solution("{()}");
       System.out.println(ans);
    }

    private static boolean Solution(String s){
        char[] charArray = new char[s.length()];
        int top = -1;
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c =='['){
                charArray[++top] = c;
            }
            else if (c == '}' || c== ']' || c== ')'){
                if(top ==-1) return false;
                char open = charArray[top--];
                if (!(isPair(c, open))){
                    return false;
                }
            }

        }
        return true;
    }
    private static boolean isPair(char c , char d){
        return (c == '{' && d == '}') || 
               (c=='[' && d == ']') || 
               (c=='(' && d==')');
    }

}
