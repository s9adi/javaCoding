package coding.practice;

public class ReverseALinkedList {

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while (current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        return prev;
    }
    public static void main(String[] args) {

    }

}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value){
        this.value = value;
    }
}
