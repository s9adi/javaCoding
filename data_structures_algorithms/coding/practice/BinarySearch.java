package coding.practice;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int [] array = new int[]{1,2,1,8,9,3,7,44,66,9};
        Arrays.sort(array);
        int target = 3;

        Binary(target, array);
    }
    

    public static void Binary(int target , int [] array){
        

        int left = 0; int right  = array.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (array[mid] == target){
                System.out.println("The the array has the element at position " + mid);
                return;
            }else if (target > array[mid]){
                left =mid+1;

            }else {
                right = mid -1;
            }
        }

        System.out.println("We couldnt find the element");
       
    }
}
