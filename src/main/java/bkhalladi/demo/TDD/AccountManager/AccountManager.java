package bkhalladi.demo.TDD.AccountManager;

import bkhalladi.demo.TDD.Account.Account;

public class AccountManager {

    public void transfer(Account accountOrigin, Account accountDestination, int amount){

        if (amount < 1501){
            accountOrigin.withdrawFromBalance(amount);
            accountDestination.depositToBalance(amount);
        }
    }

}
