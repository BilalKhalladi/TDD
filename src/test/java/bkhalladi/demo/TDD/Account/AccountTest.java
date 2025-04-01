package bkhalladi.demo.TDD.Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    void whenCreatingNewAccountSetsAccountBalanceTo0() {

        Account account = new Account();

        assertEquals(0, account.getBalance());
    }

    @Test
    void whenDepositing10ToEmptyAccountSetsBalanceTo10() {

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
    void whenDepositing2500toAccountBalanceOf100SetsBalanceTo2600() {

        Account account = new Account();
        account.depositToBalance(100);
        account.depositToBalance(2500);
        assertEquals(2600, account.getBalance());
    }

    @Test
    void whenDepositingNegativeAmountToEmptyAccountSetsBalanceTo0() {

        Account account = new Account();
        account.depositToBalance(-10);
        assertEquals(0, account.getBalance());
    }

    //Next 2 tests are testing limits
    @Test
    void whenDepositing3000ToEmptyAccountSetsBalanceTo3000() {

        Account account = new Account();
        account.depositToBalance(3000);
        assertEquals(3000, account.getBalance());
    }

    @Test
    void whenDepositing3001ToEmptyAccountSetsBalanceTo0() {

        Account account = new Account();
        account.depositToBalance(3001);
        assertEquals(0, account.getBalance());
    }

    @Test
    void whenWithdrawing10FromBalanceOf500SetsBalanceTo490() {

        Account account = new Account();
        account.depositToBalance(500);
        account.withdrawFromBalance(10);
        assertEquals(490, account.getBalance());
    }

    @Test
    void whenWithdrawing300FromBalanceOf100SetsBalanceTo100() {

        Account account = new Account();
        account.depositToBalance(100);
        account.withdrawFromBalance(300);
        assertEquals(100, account.getBalance());
    }

    @Test
    void whenWithdrawingNegativeAmountLeavesBalanceUnchanged() {

        Account account = new Account();
        account.depositToBalance(300);
        account.withdrawFromBalance(-10);
        assertEquals(300, account.getBalance());
    }

    @Test
    void whenWithdrawing3000FromBalanceOf4000SetsBalanceTo1000() {

        Account account = new Account();
        account.depositToBalance(2000);
        account.depositToBalance(2000);
        account.withdrawFromBalance(3000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void whenWithdrawing3001FromBalanceOf4000LeavesBalanceUnchanged() {

        Account account = new Account();
        account.depositToBalance(2000);
        account.depositToBalance(2000);
        account.withdrawFromBalance(3001);
        assertEquals(4000, account.getBalance());
    }

    @Test
    void whenWithdrawing1000fromAccountWithBalanceOf1000SetsAccountBalanceTo0(){

        Account account = new Account();
        account.depositToBalance(1000);
        account.withdrawFromBalance(1000);
        assertEquals(0, account.getBalance());
    }
}