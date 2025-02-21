/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package FavouriteQuestions;

/**
 *
 * @author Aditya Sharma
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aditya Sharma
 */
public class NumberConversion {

    public static void main(String[] args) {
        int integer = Solution("DCC"); // Change the input string as needed
        System.out.println(integer);

        System.out.println(Solution2(1000));
    }

    private static int Solution(String s) {
        Map<Character, Integer> roman = new HashMap<>();

        // Initialize the map with Roman numeral values
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int integerValue = 0;

        // Loop through the string and calculate the integer value
        for (int i = 0; i < s.length() - 1; i++) {
            // If the current Roman numeral is smaller than the next, subtract it
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                integerValue -= roman.get(s.charAt(i));
            } else {
                // Otherwise, add it
                integerValue += roman.get(s.charAt(i));
            }
        }

        // Add the value of the last character
        integerValue += roman.get(s.charAt(s.length() - 1));

        return integerValue;
    }

    private static String Solution2(int num) {
        final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        final String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }

        return sb.toString();
    }
}
