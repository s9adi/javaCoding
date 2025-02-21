package Interviews.implementations;

// Queue is Data structure that follows fifo
// rear is the last element and the new element should be added there 
// front is the element that will be first one out
public class Queue {

    private int front;
    private int rear;
    private int capacity;
    private int[] queue;
    private int size;

    public Queue(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        queue = new int[capacity];
    }

    public void enqueue(int value){
        if (size == queue.length){
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear+1)%capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue(){
        if (size == 0){
            System.out.println("Operation can be done queue is empty");
            return -1;
        }
        int value = queue[front];
        front = (front +1)%capacity;
        size--;
        return value;
    }

    public int peek(){
        if (size == 0) {
            System.out.println("No elements");
            return -1;
        }
        int value = queue[front];
        return value ;

    }

    public void print(){
       for (int i = 0 ; i < size ; i++){
        System.out.print(queue[(i+front)%capacity] + "\t");
       }
    }

}
