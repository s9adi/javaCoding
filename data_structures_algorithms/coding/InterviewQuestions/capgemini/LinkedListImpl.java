package coding.InterviewQuestions.capgemini;

public class LinkedListImpl {
    Node head;
    Node tail;

    public LinkedListImpl (){
        head = null;
        tail = null;
    }

    public void insertAtStart(int value){
        Node node = new Node();
        node.value = value;

        // basically head is pointing to another node 
        // we have to make the head point to this new node 
        // and the new node point to the other node 
        // that head was previously pointing 

        node.next = head;
        head = node;

    }

    public void insertAtEnd(int value){
        Node node = new Node();
        node.value = value;
        node.next = null;

        // tail should point to the last element 
        // and the element now tail is pointing at should point to this new node 

        if (tail == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

    public void display(){
        // this will just print all the nodes

        Node node = head;
        while(node != null){
            System.out.println(node.value);
            if (node.next !=null){
                System.out.print("->");
            }
        }
    }
}

class Node {
    int value;
    Node next;

    // public Node(int value){
    //     this.value = value;
    // }
}
