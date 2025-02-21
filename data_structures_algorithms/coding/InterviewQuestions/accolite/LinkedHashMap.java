package coding.InterviewQuestions.accolite;

public class LinkedHashMap {

    final private int CAPACITY = 16;  

    Node[] buckets;
    private static Integer SIZE ;
    
    public LinkedHashMap(){
        buckets = new Node[CAPACITY];
        SIZE = 0;

        head = new Node(null, null);
        tail = new Node(null, null);
        head.next = tail ;
        tail.prev = head ;
    }

    private static class Node{

        private Integer Key ;
        private Integer value ;
        Node next ;
        Node prev ;

        public Node(Integer key , Integer value){
            this.Key = key;
            this.value = value;
        }

    }

    private Node head , tail ;

    private int getIndex(Integer key){
        return key == null ? 0 : key.hashCode()%CAPACITY;
    }

    private void put(Integer key , Integer value){
        int index = getIndex(key);
        Node node  = new Node(key, value);

        
    }


    
}
