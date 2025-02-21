package coding.InterviewQuestions.accolite ;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public static void main(String[] args) {
        System.out.println("This is LRU Cache");
    }
    private static class Node {
        int key;
        int value;
        Node next ;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity = 6;
    private Map<Integer , Node> map ;
    private Node head;
    private Node tail;

    public LRUCache(){
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public void put(int key , int value){
        Node node = map.get(key);
        if (node != null){
            node.value = value;
            moveToFront(node);
        }else {
            if(map.size() == capacity){
                removeLRU();
            }
            Node newNode = new Node(key, value);
            map.put(key, node);
            addToFront(node);
        }
        
    }

    public int get(int key){
        Node node = map.get(key);
        if (node != null){
            moveToFront(node);
            return node.value;
            
        }else {
            return -1;
        }
    }

    private void addToFront(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void moveToFront(Node node){
        removeNode(node);
        addToFront(node);
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
       node.next.prev = node.prev;
    }

    private void removeLRU(){
        Node lru = tail.prev;
        removeNode(lru);
        map.remove(lru.key);
    }
}