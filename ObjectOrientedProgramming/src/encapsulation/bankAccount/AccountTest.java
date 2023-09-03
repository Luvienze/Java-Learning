package bankAccount;

public class AccountTest {

	public static void main(String[] args) 
	{
		Account account1 = new Account();
		account1.setAccountName("Eren Sonmez");
		account1.setAccountAge(21);
		account1.setAccountSex('M');
		account1.setAccountBalance(4000);
		account1.setAccountTCKN(341241212);
		
		Account account2 = new Account();
		
		AccountClient client1 = new AccountClient();
		client1.setAccount(account1);
		account1.setClient(client1);
		
		AccountClient client2 = new AccountClient();
		client2.setAccount(account2);
		account2.setClient(client2);
		
		client1.printMoneyTransferFee();
		/*account1.getBalance();
		System.out.println("----");
		
		client1.deposit(500);
		account1.getBalance();
		
		System.out.println("----");
		
		client1.withdraw(200);
		account1.getBalance();
		
		client1.withdraw(300.1);*/
		
		client1.transferMoney(account1, account2, 600);
		System.out.println("*****");
		
		//client1.depositMoney(850);
		
		
		
		
	}

}


