package bkhalladi.demo.TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    void whenCreatingNewAccountSetsAccountBalanceTo0(){

        Account account = new Account();

        assertEquals(0, account.getBalance());
    }

    @Test
    void whenDepositing10ToEmptyAccountSetsBalanceTo10(){

        Account account = new Account();
        account.depositToBalance(10);
        assertEquals(10, account.getBalance());
    }

    /*Not testing new functionality

    @Test
    void whenDepositing2000ToEmptyAccountSetsBalanceTo2000(){

        Account account = new Account();
        account.depositToBalance(2000);
        assertEquals(2000, account.getBalance());
    }*/

    @Test
    void whenDepositing2500toAccountBalanceOf100SetsBalanceTo2600(){

        Account account = new Account();
        account.depositToBalance(100);
        account.depositToBalance(2500);
        assertEquals(2600, account.getBalance());
    }

    @Test
    void whenDepositingNegativeAmountToEmptyAccountSetsBalanceTo0(){

        Account account = new Account();
        account.depositToBalance(-10);
        assertEquals(0, account.getBalance());
    }

    //Next 2 tests are testing limits
    @Test
    void whenDepositing3000ToEmptyAccountSetsBalanceTo3000(){

        Account account = new Account();
        account.depositToBalance(3000);
        assertEquals(3000, account.getBalance());
    }

    @Test
    void whenDepositing3001ToEmptyAccountSetsBalanceTo0(){

        Account account = new Account();
        account.depositToBalance(3001);
        assertEquals(0, account.getBalance());
    }

    @Test
    void whenWithdrawing10FromBalanceOf500SetsBalanceTo490(){

        Account account = new Account();
        account.depositToBalance(500);
        account.withdrawFromBalance(10);
        assertEquals(490, account.getBalance());
    }

    @Test
    void whenWithdrawing300FromBalanceOf100SetsBalanceTo100(){

        Account account = new Account();
        account.depositToBalance(100);
        account.withdrawFromBalance(300);
        assertEquals(100, account.getBalance());
    }

    @Test
    void whenWithdrawingNegativeAmountLeavesBalanceUnchanged(){

        Account account = new Account();
        account.depositToBalance(300);
        account.withdrawFromBalance(-10);
        assertEquals(300, account.getBalance());
    }

    @Test
    void whenWithdrawing3000FromBalanceOf4000SetsBalanceTo1000(){

        Account account = new Account();
        account.depositToBalance(2000);
        account.depositToBalance(2000);
        account.withdrawFromBalance(3000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void whenWithdrawing3001FromBalanceOf4000LeavesBalanceUnchanged(){

        Account account = new Account();
        account.depositToBalance(2000);
        account.depositToBalance(2000);
        account.withdrawFromBalance(3001);
        assertEquals(4000, account.getBalance());
    }

    @Test
    void whenTransferring10FromAccount1Decreases10fromAccount1Increases10toAccount2(){

        Account account1 = new Account();
        Account account2 = new Account();

        account1.depositToBalance(300);
        account2.depositToBalance(400);

        account1.transfer(account2, 10);

        assertEquals(290, account1.getBalance());
        assertEquals(410, account2.getBalance());
    }

    /*
    This test is redundant, it can be eliminated since it does not test any new functionality, the test
     of above is enough, they're the same

    @Test
    void whenTransferring100FromAccount1Decreases100fromAccount1Increases100toAccount2(){

        Account account1 = new Account();
        Account account2 = new Account();

        account1.depositToBalance(300);
        account2.depositToBalance(400);

        account1.transfer(account2, 100);

        assertEquals(200, account1.getBalance());
        assertEquals(500, account2.getBalance());
    }
    */

    @Test
    void whenTransferringNegativeAmountBothAccountsBalanceRemainUnchanged(){

        Account account1 = new Account();
        Account account2 = new Account();

        account1.depositToBalance(300);
        account2.depositToBalance(40);

        account1.transfer(account2, -10);

        assertEquals(300, account1.getBalance());
        assertEquals(40, account2.getBalance());
    }

    /*
    This one might seem similar to the one testing transfers of 10 and 100 (the commented method of above),
    it looks like it does not test any new functionality, but we keep it to test limits, 1500 is the max
    amount to be transferred so we check that it is possible to transfer 1500 with this test, with the next test
    we'll check transfers of 1501 which surpasses the limit, this applies to the deposit of 3000/3001 methods
    */

    @Test
    void whenTransferring1500FromAccount1Decreases1500fromAccount1Increases1500toAccount2(){

        Account account1 = new Account();
        Account account2 = new Account();

        account1.depositToBalance(2500);
        account2.depositToBalance(500);

        account1.transfer(account2, 1500);

        assertEquals(1000, account1.getBalance());
        assertEquals(2000, account2.getBalance());
    }

    @Test
    void whenTransferring1501BothAccountBalancesRemainUnchanged(){

        Account account1 = new Account();
        Account account2 = new Account();

        account1.depositToBalance(2500);
        account2.depositToBalance(500);

        account1.transfer(account2, 1501);

        assertEquals(2500, account1.getBalance());
        assertEquals(500, account2.getBalance());
    }

    /*Not testing new functionality

    @Test
    void whenTransferring1000and1200UpdatesBalancesOfBothAccountsCorrectly(){

        Account account1 = new Account();
        Account account2 = new Account();

        account1.depositToBalance(2500);
        account2.depositToBalance(500);

        account1.transfer(account2, 1000);
        account1.transfer(account2, 1200);

        assertEquals(300, account1.getBalance());
        assertEquals(2700, account2.getBalance());
    }*/
}
