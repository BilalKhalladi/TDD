package bkhalladi.demo.TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void newAccountBalance(){

        Account account = new Account();
        //assertEquals(0, new Account().getBalance());
        assertEquals(0, account.getBalance());
    }

    @Test
    public void add10toBalanceToEmptyAccount(){

        Account account = new Account();

        account.addToBalance(10);

        assertEquals(10, account.getBalance());
    }

    @Test
    public void add2000toBalanceToEmptyAccount(){

        Account account = new Account();
        account.addToBalance(2000);

        assertEquals(2000, account.getBalance());
    }

    @Test
    public void incrementAcountBalance(){

        Account account = new Account();
        account.addToBalance(100);
        account.addToBalance(2500);
        assertEquals(2600, account.getBalance());
    }

    @Test
    public void incrementNegativeAmountToAccountBalance(){

        Account account = new Account();
        account.addToBalance(-10);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void withdrawAmountFromBalance(){

        Account account = new Account();
        account.addToBalance(1000);
        account.withdrawFromBalance(1000);
        assertEquals(0, account.getBalance());
    }


}
