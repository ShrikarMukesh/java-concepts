package thread.creation.examples2;

public class Main1 {
    public static void main(String[] args) {
        Thread thread = new NewThread();
        thread.start();
    }
    private static class NewThread extends Thread{
        @Override
        public void run() {
            Thread.currentThread().setName("Byulk");
            System.out.println("Hello from "+Thread.currentThread().getName());
            System.out.println(this.getPriority());
            System.out.println(this.getState());
            System.out.println(this.getId());
            System.out.println(this.getStackTrace());
            System.out.println(this.getThreadGroup());
            System.out.println(this.getName());
        }
    }
}
