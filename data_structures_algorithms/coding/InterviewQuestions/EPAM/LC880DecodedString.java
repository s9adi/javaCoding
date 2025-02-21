package data_structures_algorithms.coding.InterviewQuestions.EPAM;

public class LC880DecodedString {

    public static void main(String[] args) {

    }

    private static String Solution(String string , int k) {
        /*
        Input: s = "leet2code3", k = 10
        Output: "o"
        Explanation: The decoded string is "leetleetcodeleetleetcodeleetleetcode".
        The 10th letter in the string is "o".
         */
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(ch)) {
                int value = ch - '0';
                String temp = stringbuilder.toString();
                for (int j = 1 ; j < value ; j++){
                    stringbuilder.append(temp);
                    if (stringbuilder.length() >= k){
                        return Character.toString(stringbuilder.toString().charAt(k));
                    }
                }
            }
            stringbuilder.append(ch);
        }

        return Character.toString(stringbuilder.toString().charAt(k));

    }
}
