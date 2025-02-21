package data_structures_algorithms.coding.InterviewQuestions.EPAM;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        Solution("aabbcda");
    }

    private static void Solution(String string) {
        // aabbcda -> abcda
        StringBuilder output = new StringBuilder();
        output.append(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(i - 1)) {
                output.append(string.charAt(i));
            }
        }
        System.out.println(output.toString());

        /*
        String s = "aabcca";
        StringBuilder sb = new StringBuilder();
        char prev = '\0';
        for(char c : s.toCharArray()){
            if(c != prev){
                sb.append(c);
                prev = c;
            }
        }
        System.out.println(sb);
         */
    }
}
