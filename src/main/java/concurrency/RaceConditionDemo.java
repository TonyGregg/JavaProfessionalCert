package concurrency;

/**
 * Created by genil on 6/21/18 at 17 59
 *
 * Race condition - Check and then act
 **/
public class RaceConditionDemo {

    public static void main(String[] args) {

        BankAccount bankAccount  = new BankAccount();
        bankAccount.setBalance(100);;
        Thread thread = new Thread(bankAccount);
        thread.setName("Antony");

        Thread thread2 = new Thread(bankAccount);
        thread2.setName("Steffi");

        thread.start();
        thread2.start();
    }
}

class BankAccount implements Runnable{
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int balance;
    private synchronized void makeWithdrawal(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName()+" is about to withdraw ..");
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+ " Withdrawn. Balance left $"+balance);
        }else {
            System.out.println("Sorry, not sufficient fund left to withdraw "+amount+ " Balance "+balance
                    + " for "+Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " going to  withdraw .."+balance);

        makeWithdrawal((75));
        if(balance<0) {
            System.out.println("Pochu... ellam pochu.. -ve balance company la");
        }
    }
}
