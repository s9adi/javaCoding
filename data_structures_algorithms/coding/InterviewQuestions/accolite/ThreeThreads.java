package coding.InterviewQuestions.accolite;

public class ThreeThreads {
    private static int counter  = 1;
    private static Object lock = new Object();

    public static void main(String[] args){
        int n = 10;

        Thread th1  = new Thread(() -> print(1, n));
        Thread th2  = new Thread(() -> print(2, n));
        Thread th3  = new Thread(() -> print(3, n));
        
        th1.start();
        th2.start();
        th3.start();
    }

    private static void print(int id  , int n){
        while (counter <= n){
            synchronized(lock){
                if (counter%3 == id%3){
                    System.out.println("In thread " + id + " counter " + counter);
                    counter++;
                    lock.notifyAll(); // Notify all other threads
                }else {
                    try{
                        lock.wait();
                    }catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
