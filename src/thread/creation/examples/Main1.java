package thread.creation.examples;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //code that will run in new thread
                System.out.println("we are now in thread "+Thread.currentThread().getName());
                System.out.println("priority of mukesh thread = "+Thread.currentThread().getPriority());
            }
        });
        thread.setName("Mukesh thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("we are in thread: "+Thread.currentThread().getName()+" before starting new thread");
        thread.start();
        System.out.println("we are in thread: "+Thread.currentThread().getName()+" after starting new thread");
        Thread.sleep(10000);
    }
}
