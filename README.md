# README #

### What is this repository for? ###

* Practice Test-driven Development with Spring Boot, Java 21 and JUnit
* 0.0.1-SNAPSHOT

### How do I get set up? ###

* Java 21 in your IDE (Intellij IDEA recommended), or PATH.
* Maven in your IDE or PATH and run with ```mvn clean install -U``` to pass all integration and unit tests. Note that DemoApplicationTests tests are deactivated by commented annotations to focus only in unit tests.
* You can just pass all tests by right-clicking in the project -> Run 'All Tests' or ```Crtl``` + ```Shift``` + ```F10```.

### Customer Requirements ###

Based on the requirements analysis use cases, the validations that must be met can already be extracted (**in bold**):

## Account Creation
Accounts are always created with a balance of 0. A deposit must be made afterward if you want to have a balance.

* **When creating an account, the balance is zero**

## Deposits
They add the deposited amount to the balance.
There are no commissions or similar fees.

* **When depositing 10 into an empty account, the balance is 10**
* **When depositing 2000 into an empty account, the balance is 2000**
* **When depositing 2500 into an account with 100, the balance is 2600**
* **Negative deposits cannot be made**
* **When depositing -10 into an empty account, the balance remains 0**
* **The maximum amount that can be deposited is 3000**
* **If I deposit 3000 into an empty account, the balance is 3000**
* **If I deposit 3001 into an empty account, the balance is 0**

## Withdrawals
They subtract the withdrawn amount from the balance.
There are no commissions or similar fees.

* **When withdrawing 10 from an account with 500, the balance is 490**
* **An amount greater than the available balance cannot be withdrawn**
* **If I withdraw 300 from an account with 100, nothing happens and the balance remains 100**
* **Negative amounts cannot be withdrawn**
* **If I withdraw -10 from an account with 300, nothing happens and the balance remains 300**
* **The maximum amount that can be withdrawn is 3000**
* **If I withdraw 3000 from an account with 4000, the balance is 1000**
* **If I withdraw 3001 from an account with 4000, nothing happens and the balance remains 4000**

## Transfers
* **When making a transfer of 10 from an account with 300 to one with 400, the balance in the first account will become 290 and in the second, it will become 410.**
* **When making a transfer of 100 from an account with 300 to one with 400, the balance in the first account will become 200 and in the second, it will become 500.**
* **Negative amounts cannot be transferred**
* **When making a transfer of -10 from an account with 300 to one with 40, the balances remain 300 and 40 respectively**
* **The transfer limit from a single account is 1500:**
* **When making a transfer of 1500 from an account with 2500 to one with 500, the balance in the first account will become 1000 and in the second, it will become 2000.**
* **When making a transfer of 1501 from an account with 2500 to one with 500, the balance in the first account will remain 2500 and in the second, it will remain 500.**
* **When making a transfer of 1000 from an account with 2500 to one with 500, and right after another transfer of 1200, the balance in the first account will become 300 and in the second, it will become 2700.**