package data_structures_algorithms.coding.InterviewQuestions.EPAM;

public class RotateImage {
    public static void main(String[] args) {

    }
    private static void Solution(int[][] matrix){
        /*
        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [[7,4,1],[8,5,2],[9,6,3]]

        Input: matrix = [[5,1,9,11],
                         [2,4,8,10],
                         [13,3,6,7],
                         [15,14,12,16]]
        Output: [[15,13,2,5],
                 [14,3,4,1],
                 [12,6,8,9],
                 [16,7,10,11]]
         */

        int len = matrix[0].length;
        int[][] expectedOutput = new int[matrix.length][matrix[0].length];
        int n = matrix.length;
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix.length ; j++){
                expectedOutput[i][j] = matrix[n-i-1][i];
            }
        }

    }
}
