package bkhalladi.demo.TDD;

public class Account {

    private int balance;

    public Account(){

        this.balance = 0;
    }

    public int getBalance(){

        return this.balance;
    }

    public void addToBalance(int amount){

        if (amount <= 0){
            return;
        }
        this.balance += amount;
    }

    public void withdrawFromBalance(int amount){

        this.balance -= amount;
    }
}
