package thread.creation.ThreadCoordination;

public class Main1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Blockingtask());
        thread.start();
        thread.interrupt();
    }
    private static class Blockingtask implements  Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking queue");
            }
        }
    }

}
