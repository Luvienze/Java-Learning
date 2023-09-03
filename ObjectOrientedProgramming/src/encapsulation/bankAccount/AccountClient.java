package bankAccount;

public class AccountClient {
	private double money;
	private Account account;
	private final double moneyTransferFee = 3.02;
	
	public void setAccount (Account account) {
		this.account = account;
	}
	private void withdraw (double money) {
		if(money <= account.balance()) {
			account.setAccountBalance(account.balance() - money);
			System.out.println("Withdraw succesed.");
			System.out.println("New balance: " + account.balance());
		}
		else
		{
			System.out.println("Withdraw unsuccesed.");
		}
	}
	public void withdrawMoney (double money) {
		this.withdraw(money);
	}
	
	private void deposit (double money) {
		account.setAccountBalance(account.balance() + money);
		System.out.println("Deposit succesed.");
		System.out.println("New balance: " + account.balance());
	}
	public void depositMoney(double money) {
		this.deposit(money);
	}
	
	private void transfer (Account withdrawAccount, Account depositAccount, double money) {
		if(money <= withdrawAccount.balance()) {
			withdrawAccount.setAccountBalance(withdrawAccount.balance() - money - moneyTransferFee);
			System.out.println("Withdraw account new balance: " + withdrawAccount.balance());
			
			depositAccount.setAccountBalance(depositAccount.balance() + money);
			System.out.println("Deposit account new balance: " + depositAccount.balance());
		}
		else
		{
			System.out.println("Cannot succesed transfer...");
			System.out.println("Limit over...");
		}
	}
	public void transferMoney (Account withdrawAccount, Account depositAccount, double money) {
		this.transfer(withdrawAccount, depositAccount, money);
	}
	
	public void printMoneyTransferFee() {
		System.out.println("Money Transfer Fee is " + this.moneyTransferFee);
	}
}
