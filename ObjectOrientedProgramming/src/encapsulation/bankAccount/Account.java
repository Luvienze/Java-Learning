package bankAccount;

public class Account {
		private String name;
		private int tckn;
		private int age;
		private char sex;
		private double balance;
		private AccountClient client;
		{
			name = "Kemal Cihan";
			age = 25;
			sex = 'M';
			tckn = 00000000;
			balance = 2000;
		}
		public void setAccountName(String name) {
			this.name = name;
		}
		public void setAccountAge(int age) {
			this.age = age;
		}
		public void setAccountSex(char sex) {
			this.sex = sex;
		}
		public void setAccountTCKN(int tckn) {
			for(int i=1; i<6; i++) {
				tckn = i;
				this.tckn = tckn;
			}
		}
		public void setClient(AccountClient client) {
			this.client = client;
		}
		
		private void getName() {
			System.out.println("Account's name:" + name);
		}
		private void getTCKN() {
			System.out.println("Account's TCKN:" + tckn);
		}
		private void getSex() {
			System.out.println("Account's sex: " + sex);
		}
		private void getAge() {
			System.out.println("Account's  age: " + age);
		}
	
		public void printAccountName() {
			this.getName();
		}
		public void printAccountTCKN() {
			this.getTCKN();
		}
		public void printAccountSex() {
			this.getSex();
		}
		public void printAccountAge() {
			this.getAge();
		}
		public void printBalance() {
			System.out.println("Balance:" + this.balance());
		}
		public void accountInfo() {
			this.printAccountName();
			this.printAccountTCKN();
			this.printAccountSex();
			this.printAccountSex();
			this.balance();
		}
		
		private double setBalance (double balance) {
			return this.balance = balance;
		}
		public double setAccountBalance(double balance) {
			return this.setBalance(balance);
		}
		private double getBalance() {
			return balance;
		}
		public double balance() {
			return this.getBalance();
		}
	
}
