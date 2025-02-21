package coding.InterviewQuestions.capgemini;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumberFromList {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,6,6,6);
        Solution(list);
    }

    private static void Solution(List<Integer> list){
        
        Set<Integer> set = new HashSet<>();

        for (int i = 0  ; i < list.size() ; i++){
            set.add(list.get(i));
        }

        System.out.println(set);
    }

}
