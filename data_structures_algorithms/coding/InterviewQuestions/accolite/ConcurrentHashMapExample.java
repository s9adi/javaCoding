package coding.InterviewQuestions.accolite;

import java.util.concurrent.*;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        
        // Create a ConcurrentHashMap with an initial capacity of 4 and load factor of 0.75
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>(4, 0.75f);

        // Adding elements to the map
        concurrentMap.put(1, "One");
        concurrentMap.put(2, "Two");
        concurrentMap.put(3, "Three");

        // Displaying the map content
        System.out.println("Initial Map: " + concurrentMap);

        // Concurrent modification (Multiple threads accessing the map)
        Runnable task1 = () -> {
            for (int i = 4; i < 7; i++) {
                concurrentMap.put(i, "Value" + i);
                System.out.println(Thread.currentThread().getName() + " added: " + i + " -> Value" + i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 1; i <= 3; i++) {
                String value = concurrentMap.get(i);
                System.out.println(Thread.currentThread().getName() + " read: " + i + " -> " + value);
            }
        };

        // Starting the threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final content of the map
        System.out.println("Final Map: " + concurrentMap);
    }
}
