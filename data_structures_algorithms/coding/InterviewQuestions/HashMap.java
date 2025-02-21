package coding.InterviewQuestions;

@SuppressWarnings("unused")
public class HashMap {
    
    private static final Integer size  = 16;
    Integer capacity = 0;
    Node[] buckets ;

    class Node{
        Integer key ;
        Integer value;
        Node next ;

        Node(Integer key , Integer value){
            this.key = key ; 
            this.value = value ;
        }

        @Override
        public boolean equals(Object obj){
            if (this == obj){
                return true; // if the reference is same 
            }

            if (obj == null || obj.getClass() != getClass()){
                return false;
            }

            Node node = (Node)obj;
            return this.key.equals(node);
        }

        @Override
        public int hashCode(){
            return this.key.hashCode();
        }
    }

    public HashMap(){
        buckets = new Node[size];
    }
    private int getIndex(Integer key ){
        return key.hashCode()%size;
    }

    public int put (int key , int value){
        Integer index = getIndex(key);
        Node newNode = new Node(key, value);

        if (buckets[index] == null){
            buckets[index] = newNode;
        }else {
            Node traverseNode = buckets[index];
            while(traverseNode !=null){
                if (traverseNode.key.equals(key)){
                    // not collsion
                    traverseNode.value = value;
                    break;
                }
                traverseNode = traverseNode.next;
            }
            // if key is not found 

            // collsion is when 2 different keys produces the same value
            // since the the key does not exist and there is already a linked list so there is collison here 

            // to handle collison we add the values at the head of the value 

            newNode.next = buckets[index];
            buckets[index] = newNode;

           
            
        }

        return newNode.key;

    }

    private Integer get(int key){
        // returns the key

        int index = getIndex(key);

        Node current = buckets[index];

        while(current != null){
            if (current.key.equals(key)){
                return current.value;
            }
            current = current.next;

        }
        return null;
    }

    public Integer remove(Integer key){
        // again get the integer 
        int index = getIndex(key);
        Node current = buckets[key];
        Node prev = null;

        while(current != null){
            if (current.key.equals(key)){
                if(prev == null){
                    buckets[index] = current.next;
                }else {
                    prev.next = current.next;
                }

                return current.key;
            }
            prev= current;
            current = current.next;
        }
        return null;
    }


}
