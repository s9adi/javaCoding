package coding.InterviewQuestions.KPMG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static void main(String[] args) {
        int[] array = { -1, 0, 1, 2, -1, -4 };
        SOlutionOptimized(array);
        SolutionWithoutSort(array);
    }

    private static void SolutionWithoutSort(int[] array) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < array.length - 2; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array.length; j++) {
                int complement = -(array[i] + array[j]);
                if (list.contains(complement)) {
                    List<Integer> listtoAdd = new ArrayList<>();
                    listtoAdd.add(array[i]);
                    listtoAdd.add(array[j]);
                    listtoAdd.add(complement);

                    list.remove(complement);
                    set.add(listtoAdd);
                }
                set.add(list);
            }
        }

        System.out.println(set);
    }

    private static void SOlutionOptimized(int[] array) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = array.length - 1;

            while (j < k) {
                int total = array[i] + array[j] + array[k];
                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    list.add(Arrays.asList(array[i], array[j], array[k]));
                    while (j < k && array[j] == array[j - 1]) {
                        j++;
                    }
                }
            }
        }
        
        System.out.println(list);
    }
}
