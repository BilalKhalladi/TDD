package bkhalladi.demo.TDD;

public class Account {

    private int balance;

    public int getBalance() {

        return this.balance;
    }

    public void depositToBalance(int amount){

        if (amount > 0 && amount < 3001) {
            this.balance += amount;
        }
    }

    public void withdrawFromBalance(int amount) {

        if (amount < this.balance && amount > 0 && amount < 3001) {
            this.balance -= amount;
        }
    }

    public void transfer(Account account, int amount) {

        if (amount > 0 && amount < 1501) {
            account.receive(amount);
            this.balance -= amount;
        }
    }

    public void receive(int amount){

        this.balance += amount;
    }
}
