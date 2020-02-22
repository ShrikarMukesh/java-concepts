package thread.creation.examples2;

public class QuezQuestion3 {
    /*public static void main(String [] args) {
        Thread thread = new TaskThread1();
        thread.start();
    }

    private static class TaskThread1 extends Thread {
        @Override
        public void run(){
            System.out.println("Hello from new thread");
        }
    }*/
    public static void main(String [] args) {
        Thread thread = new Thread(new Task2());
        thread.start();
    }

    private static class Task2 implements Runnable {
        @Override
        public void run(){
            System.out.println("Hello from new thread");
        }
    }

}
