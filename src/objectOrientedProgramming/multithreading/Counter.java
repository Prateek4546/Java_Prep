package objectOrientedProgramming.multithreading;

public class Counter extends Thread {
    private int count;

    public  void increment(){
        count++;
    }
    public int getCount() {
        return count;
    }
    @Override
    public  void run(){
        for(int i=0; i<10; i++){
            increment();
        }
    }
}
