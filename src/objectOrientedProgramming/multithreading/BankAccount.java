package objectOrientedProgramming.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private  int balance = 100;
    public int getBalance(){
        return this.balance;
    }
    private  final Lock lock = new ReentrantLock();
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" Attempting to withdraw " + amount);
        try {
            if(lock.tryLock(1000 , TimeUnit.MILLISECONDS)){
                if(amount <= balance){
                    try {
                        System.out.println(Thread.currentThread().getName() + " Procedding with withdrawl");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal Remaining balance "+ balance);
                    } catch (Exception e) {
                      Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" insufficient balance");
                }
            }
            else {
                System.out.println(Thread.currentThread().getName()+" Could not acuire the lock i will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
