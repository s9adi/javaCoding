/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coding.InterviewQuestions.KPMG;

/**
 *
 * @author Aditya Sharma
 */
public class Decimal2Binary {
    public static void main(String[] args) {
        String str = Solution(1000);
        
        System.out.println(str);

        System.out.println(Long.valueOf(str));
    }

    private static String Solution(int num){
        // 100
        StringBuilder string = new StringBuilder();
        
        while (num > 0){
            int rem = num%2;
            string.insert(0, rem);
            num = num/2;
        }

        return string.toString();
    }
}
