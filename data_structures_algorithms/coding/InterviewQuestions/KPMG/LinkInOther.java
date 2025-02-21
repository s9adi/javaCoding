package coding.InterviewQuestions.KPMG;

/**
 *
 * @author Aditya Sharma
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkInOther {

    // we have to find one linkedList in other

    public static void main(String[] args) {

    }

    private static boolean Solution(ListNode l1, ListNode l2) {
        if (l1 == null) return true;  // An empty list1 is trivially a sublist
        if (l2 == null) return false; // If list2 is empty but list1 is not, it's impossible

        ListNode current = l2;

        while(current != null){
            ListNode temp1 = l1;
            ListNode temp2 = current;

            while (temp1 != null && temp2 != null && temp1.val == temp2.val){
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            if(temp1 == null){
                return true;
            }

            current = current.next;
        }
        return false;
    }

}
