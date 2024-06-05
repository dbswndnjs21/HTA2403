package day28.pack8;

public class Account {

    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
                balance -= money;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("잔고가 없습니다");
        } 
    }
}
