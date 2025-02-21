package coding.InterviewQuestions.accolite ;

public class MedianTwoSortedArrays {

    public static void main(String[] args) {
        
    }

    public static double Solution(int[] array1 , int[] array2){
        int n = array1.length;
        int n2 = array2.length;
        int[] output = new int[n+n2];
        
        int i = array1.length -1 ; int j = array2.length -1; int k = 0 ;

        while (i>=0 && j>=0 ){
            if (array1[i] > array2[j]){
                output[k++] = array1[i];
            }else {
                output[k++] = array2[j];
            }
            i-- ; j--;
        }
        while (i>=0){
            output[k++] = array1[i--];
        }
        while (j>=0){
            output[k++] = array2[j--];
        }

        int lenOfMerged = n+n2;

        double median = 0;

        if(lenOfMerged%2 == 0){
            median = (output[lenOfMerged / 2 - 1] + output[lenOfMerged / 2]) / 2.0;
        }else {
            median = output[lenOfMerged / 2];
        }


        return median ;

    }

}
