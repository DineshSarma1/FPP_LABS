package lab12;

public class CustomerAccount {
	private String customerName;
	private long accountNo;
	private double balance;

	CustomerAccount(String cName, long aNo, double balance) {
		this.customerName = cName;
		this.accountNo = aNo;
		this.balance = balance;
	}

	public boolean deposit(double amount) {
		if (amount < 0)
			return false;
		this.balance += amount;
		return true;
	}

	public boolean withdraw(double amount) throws MyCustomException {

		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			return true;
		}

		if (amount > this.balance) {
			throw new MyCustomException("Balance exceded");
		}

		return false;
	}

	public double getBalance() throws MyCustomException {
		if (this.balance >= 0 && this.balance < 100)
			throw new MyCustomException("Balance reach below 100$");

		return this.balance;
	}

	public static void main(String[] args) throws MyCustomException {

		CustomerAccount customerAccount = new CustomerAccount("John Deap", 98607117, 1050);

		try {
			System.out.println("Current Balance : " + customerAccount.getBalance());
			System.out.println("Deposit testing " + customerAccount.deposit(100));
			System.out.println("Current balance: " + customerAccount.getBalance());

			System.out.println("Withdraw : " + customerAccount.withdraw(110));
			System.out.println("Current : " + customerAccount.getBalance());

			System.out.println(customerAccount.deposit(-1));

		} catch (MyCustomException ex) {
			System.out.println(ex.getMessage());
		}
	}

	class MyCustomException extends Exception {

		private static final long serialVersionUID = 1L;

		public MyCustomException() {
			super();
		}

		public MyCustomException(String msg) {
			super(msg);
		}
	}
}
