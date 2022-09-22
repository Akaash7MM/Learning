import java.sql.SQLOutput;

class Pet extends Thread {
    public void run(){
        for(int i = 0 ; i<10;i++){
            System.out.println("PET");
        }
        try{
            Thread.sleep(100);
        } catch(Exception e){
            System.out.println("Caught");
        }

    }
}
class Wild extends Thread {
    public void run(){
        for(int i = 0 ; i<10;i++){
            System.out.println("WILD");
            try{
                Thread.sleep(100);
            } catch(Exception e){
                System.out.println("Caught");
            }
        }

    }
}

class Marine implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i<10;i++){
            System.out.println("Marine");
            try{
                Thread.sleep(100);
            } catch(Exception e){
                System.out.println("Caught");
            }
    }
}
}

public class Threadimpl {

    // Thread is used to have programs running parallel to each other without waiting for each other
    // Incase you want other threads to finish before you use .join in the thread to wait for .join threads
    // .isAlive to check if alive
    // cant extend with thread if already extending so need use Runnable interface
    public static void main(String args[]) throws InterruptedException {
        Pet pet = new Pet();
        Wild wild = new Wild();

        Marine marine = new Marine();
        Runnable marine2 = new Marine();

        Thread t1 = new Thread(marine);

        t1.start();
        pet.start();
        wild.start();

        pet.join();
        wild.join();
        t1.join();

        System.out.println("Bye");
        System.out.println(t1.isAlive());

    }
}
