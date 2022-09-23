import java.sql.SQLOutput;

public class Sync {
    int counter;

    public synchronized void increment() {
        counter++;
    }
}

// While the main thread waits for the other two threads to complete using .join which otherwise would have executed its own code in main thread
// The other threads access same method at same time, making change to a property that is getting changed using a non-latest value leading to wrong final value
// Using syncronized a method can only be accessed by single thread at one time.
class SyncDemo {

    public static void main(String args[]) throws InterruptedException {
        Sync obj = new Sync();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<10000 ; i++){
                    obj.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<10000 ; i++){
                    obj.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.counter);

    }


}
