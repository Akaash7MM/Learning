import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExecutionServiceImpl {

    //ExecutorService helps us execute tasks without creating n Threads for n Tasks
    //We can give a fixed number of threads that can be created to handle the tasks
    //or we can give core threads(number of threads generally),
    // Max threads(Incase we need more threads),time alive(for threads other than core)

    // .execute -> takes an runnable implementation and executes it
    //.submit -> takes a runnable(returns void) and callable(returns Object)
    // it returns a Future object, it helps us to keep track of the thread
    // which has its own methods like
    // .isDone(is the task complete)
    // .get() ( this blocks the main thread until run of the Runnable/Callable has been completed)
    // returns whatever the run method returns.
    // .cancel cancels the task associated with the future.

    //.invokeAny -> used to invoke any one of the callables from a collection
    // rest of them are cancelled [ useful for low latency for obtaining data ]

    //invokeAll -> returns a list of Futures all of the tasks in a collection

    // .shutdown -> waits for the tasks to complete and then shuts down the executor service
    // .shutdownNow -> The task at hand might or might not be cancelled to shutdown the executor service,
    //                 the un-executed taks will be returned as a list

     public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //                                Executors.newSingleThreadExecutor(); == 1

        // Executing a bunch of Runnables
        for(int i = 0 ; i<7 ;i++){
            executorService.execute(newRunnable("Task"+i));
        }

        // Adding callables to a list
        List<Callable> callableList = new ArrayList<>();
         for(int i = 0 ; i<7 ;i++){
             callableList.add(newCallable("Task in list"+i*10));
         }

         try {

             // executing one of the callables from the list
             String result = (String )executorService.invokeAny((Collection) callableList);
             // executing all the call sin the list, get a list of future objects, which can futher be dealt with.
             List<Future<String>> futuresList = executorService.invokeAll((Collection) callableList);

             for(Future f :futuresList){
                 System.out.println(f.get());
             }
             System.out.println(result);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         } catch (ExecutionException e) {
             throw new RuntimeException(e);
         }

         // Submiting runnables/callables for executions getting a Future object in return
        Future future = executorService.submit(newRunnable("Task 1.1"));
        Future future2 = executorService.submit(newCallable("Task 1.2"));

        System.out.println(future.isDone()+"future 1");
        System.out.println(future2.isDone()+"future 2");

        future2.cancel(false);

        try {

            //Blocks the thread its running in
            //return null for runnable as its run() return null
            //returns whatever you want to return from run of the Callable.

            future.get();
            System.out.println( future2.get() + "in get");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }catch (CancellationException e){
        }


        System.out.println(future.isDone()+"future 1");
        System.out.println(future2.isDone()+"future 2");

        List<Runnable> list = executorService.shutdownNow();
        executorService.shutdown();


    }
    private static Runnable newRunnable(String msg){
        return new Runnable() {
            @Override
            public void run() {
                String message = Thread.currentThread().getName() + "->" + msg;
                System.out.println(message);
            }
        };
    }
    private static Callable newCallable(String msg){
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String message = Thread.currentThread().getName() + "->" + msg;

                return message;
            }
        };
    }
}
