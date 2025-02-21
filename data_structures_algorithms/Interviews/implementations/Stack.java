package Interviews.implementations;

public class Stack {

    public static void main(String[] args) {
        
    }

    private int size;
    private int capacity;
    private int[] stack;
    private int top = -1;
    
    public Stack(int capacity){
        size = 0;
        capacity = this.capacity;
        stack = new int[capacity];
    }

    public void push(int value){
        if(size == capacity){
            System.out.println("Cant be added");
            return;
        }
        stack[size++] = value;
        top++;
    }
    public int pop(){
        if(top == -1){
            System.out.println("Cant be popped");
            return -1;
        }
        int value = stack[top--];
        size--;
        return value;
    }
}
