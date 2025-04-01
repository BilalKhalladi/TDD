package AccountManager;

import bkhalladi.demo.TDD.Account.Account;
import bkhalladi.demo.TDD.AccountManager.AccountManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountManagerTest {

    @Test
    void whenTransferring10fromAccountWith300ToAccountWith400SetsAccount1BalanceTo290andAccount2BalanceTo410(){

        Account accountOrigin = new Account();
        Account accountDestination = new Account();
        AccountManager accountManager = new AccountManager();
        accountOrigin.depositToBalance(300);
        accountDestination.depositToBalance(400);

        accountManager.transfer(accountOrigin, accountDestination, 10);

        assertEquals(290, accountOrigin.getBalance());
        assertEquals(410, accountDestination.getBalance());
    }

    @Test
    void whenTransferring100fromAccountOriginWithBalanceOf300ToAccountDestinationWithBalanceOf400SetsAccountOriginBalanceTo200andAccountDestinationBalanceTo500(){

        Account accountOrigin = new Account();
        Account accountDestination = new Account();
        AccountManager accountManager = new AccountManager();
        accountOrigin.depositToBalance(300);
        accountDestination.depositToBalance(400);

        accountManager.transfer(accountOrigin, accountDestination, 100);

        assertEquals(200, accountOrigin.getBalance());
        assertEquals(500, accountDestination.getBalance());
    }

    @Test
    void whenTransferringNegativeAmountLeavesBothAccountsBalanceUnchanged(){

        Account accountOrigin = new Account();
        Account accountDestination = new Account();
        AccountManager accountManager = new AccountManager();
        accountOrigin.depositToBalance(300);
        accountDestination.depositToBalance(40);

        accountManager.transfer(accountOrigin, accountDestination, -10);
        assertEquals(300, accountOrigin.getBalance());
        assertEquals(40, accountDestination.getBalance());
    }

    @Test
    void whenTransferring1500fromAccountOriginWithBalanceOf2500toAccountDestinationWithBalanceOf500SetsAccountOriginBalanceTo1000andAccountDestinationBalanceTo2000(){

        Account accountOrigin = new Account();
        Account accountDestination = new Account();
        AccountManager accountManager = new AccountManager();
        accountOrigin.depositToBalance(2500);
        accountDestination.depositToBalance(500);

        accountManager.transfer(accountOrigin, accountDestination, 1500);
        assertEquals(1000, accountOrigin.getBalance());
        assertEquals(2000, accountDestination.getBalance());
    }

    @Test
    void whenTransferring1501fromAccountOriginWithBalanceOf2500toAccountDestinationWithBalanceOf500LeavesBothAccountBalancesUnchanged(){

        Account accountOrigin = new Account();
        Account accountDestination = new Account();
        AccountManager accountManager = new AccountManager();
        accountOrigin.depositToBalance(2500);
        accountDestination.depositToBalance(500);

        accountManager.transfer(accountOrigin, accountDestination, 1501);
        assertEquals(2500, accountOrigin.getBalance());
        assertEquals(500, accountDestination.getBalance());
    }

    @Test
    void whenTransferring1000fromAccountWithBalanceOf2500toAccountWithBalanceOf500AndOtherTransferOf1200SetsAccountOriginBalanceTo300AndAccountDestinationBalance2700(){


        Account accountOrigin = new Account();
        Account accountDestination = new Account();
        AccountManager accountManager = new AccountManager();
        accountOrigin.depositToBalance(2500);
        accountDestination.depositToBalance(500);

        accountManager.transfer(accountOrigin, accountDestination, 1000);
        accountManager.transfer(accountOrigin, accountDestination, 1200);
        assertEquals(300, accountOrigin.getBalance());
        assertEquals(2700, accountDestination.getBalance());
    }
}
