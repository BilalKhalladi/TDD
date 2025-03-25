package bkhalladi.demo.TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void newAccountBalance(){

        //Account account = new Account();
        assertEquals(0, new Account().getBalance());
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


    }


}
