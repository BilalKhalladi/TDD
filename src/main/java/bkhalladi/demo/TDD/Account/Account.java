package bkhalladi.demo.TDD.Account;

public class Account {

    private int balance;

    public int getBalance() {

        return this.balance;
    }

    public void depositToBalance(int amount){

        if (checkDepositWithdrawsLimits(amount)) {
            this.balance += amount;
        }
    }

    public void withdrawFromBalance(int amount) {

        if (amount <= this.balance && checkDepositWithdrawsLimits(amount)) {
            this.balance -= amount;
        }
    }

    public boolean checkDepositWithdrawsLimits(int amount){

        return amount > 0 && amount < 3001;
    }
}
