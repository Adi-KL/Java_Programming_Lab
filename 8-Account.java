/*
==============================================================================
Write a JAVA program which has Class called Account that creates account with
Rs500 minimum balance, a deposit() method to deposit amount, a withdraw()
method to withdraw amount and also throws LessBalanceException if an account
holder tries to withdraw money which makes the balance become less than Rs500.
i. A Class called LessBalanceException which returns the statement that says
withdraw amount (Rs) is not valid.
ii. A Class which creates 2 accounts, both account deposit money and one
account tries to withdraw more money which generates a
LessBalanceException take appropriate action for the same.
============================================================================
*/

class LessBalanceException extends Exception {
public LessBalanceException(double amount) {
super(&quot;Withdraw amount (&quot; + amount + &quot; Rs) is not possible. &quot;);
}
}
class Account {
double balance;
static final double MIN_BALANCE = 500;
public Account() {
balance = MIN_BALANCE;
}
public void deposit(double amount) {
balance += amount;
System.out.println(&quot;Deposited &quot; + amount + &quot; Rs. New balance: &quot; + balance + &quot;
Rs&quot;);
}
public void withdraw(double amount) throws LessBalanceException {
if (balance - amount &lt; MIN_BALANCE) {
throw new LessBalanceException(amount);
}
balance -= amount;
System.out.println(&quot;Withdrawn &quot; + amount + &quot; Rs. New balance: &quot; + balance + &quot;
Rs&quot;);
}

public double getBalance() {
return balance;
}
}

public class TestAccount {
public static void main(String[] args) {
Account account1 = new Account();
Account account2 = new Account();

// Deposit money into both accounts
account1.deposit(1000);
account2.deposit(700);
// Try to withdraw from account1
try {
account1.withdraw(1600);
} catch (LessBalanceException e) {
System.out.println(&quot;LessBalanceException: &quot; + e.getMessage());
}
// Try to withdraw from account2
try {
account2.withdraw(200);
} catch (LessBalanceException e) {
System.out.println(&quot;LessBalanceException: &quot; + e.getMessage());
}
}
}
