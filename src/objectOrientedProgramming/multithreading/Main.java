package objectOrientedProgramming.multithreading;


public class Main {
    public static void main(String[] args) throws InterruptedException {
     Counter counter = new Counter();

      Thread t1 = new Thread(counter , "Thread 1");
      Thread t2 = new Thread(counter , "Thread 2");

      t1.start();
      t2.start();
        
        System.out.println(counter.getCount());
        //github workflow for testing
    }
}
