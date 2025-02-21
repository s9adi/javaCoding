package coding.practice;

public class HashMapImpl {

    private static final Integer SIZE = 16;

    static class Node {
        Integer key;
        Integer value;
        Node next;

        Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null || this.getClass() != object.getClass()) {
                return false;
            }
            Node node = (Node) object;
            return this.key.equals(node.key);
        }

        @Override
        public int hashCode() {
            return this.key.hashCode();
        }
    }

    Node[] buckets;

    public HashMapImpl() {
        buckets = new Node[SIZE];
    }

    public int getIndex(Integer key) {
        return key.hashCode() % SIZE;
    }

    public Object put(Integer key, Integer value) {

        // ideally the bucket should be empty
        // if not then the collsion has happened
        // then we check if the key is same for both
        // if the key is same that means we can just update
        // if the key is not same then we need to update the node at the head of the
        // bucket

        int index = getIndex(key); // Calculate the index where the key-value pair should be stored.
        Node node = buckets[index]; // Get the node at that index.
        Node newNode = new Node(key, value); // Create a new node for insertion.

        // If the bucket is empty, directly insert the new node.
        if (node == null) {
            buckets[index] = newNode;
            return null; // No previous value, return null.
        } else {
            // Handle collisions by iterating through the linked list.
            while (node != null) {
                if (node.key.equals(key)) {
                    // Key exists, update the value and return the old value.
                    Integer oldValue = node.value;
                    node.value = value;
                    return oldValue;
                }
                node = node.next; // Move to the next node in the bucket.
            }
        }

        // If the key was not found, insert the new node at the head of the linked list.
        newNode.next = buckets[index]; // Set the new node's next pointer to the existing bucket head.
        buckets[index] = newNode; // Update the bucket to point to the new node.

        return null; // No previous value, return null.
    }

    public Object delete(Integer key){
        int index = getIndex(key);
        Node traverNode = buckets[index];

       Node prev = null;

        if (traverNode == null){
            System.out.println("No Value to delete");
            return null;
        }else {
            while(traverNode != null){
                if(traverNode.key.equals(key)){
                    if (prev == null){
                        buckets[index] = traverNode.next;
                    }else{
                        prev.next = traverNode.next;
                    }
                    return traverNode.value;
                }
                prev = traverNode;
                traverNode = traverNode.next;
            }
        }

        return null;
    }

    
}
