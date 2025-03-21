package objectOrientedProgramming.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {


    private  final Lock lock = new ReentrantLock();

    public void  outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }
        finally {
            lock.unlock();
        }
    }
    public void  innerMethod(){
        lock.lock();
        try{
            System.out.println("inner Method");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample r = new ReentrantLockExample();
        r.outerMethod();
    }
}
