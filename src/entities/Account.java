package entities;

public class Account {
	private int number;
	private String holder; //titular
	private double balance; //saldo so pode ser mudado por deposito ou saque.
	
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	
	
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
 

	public String getHolder() { 
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}

	
	//O numero da conta nao pode ser alterado, por isso nao utilizaremos o Set
	public int getNumber() { 
		return number;
	}

	//nao utilizaremos o Set pois o saldo so pode ser modificado através dos métodos de saque e deposito
	public double getBalance() {
		return balance;
	}


	public void deposit (double amount) {
		balance += amount;
	}
	
	//saque
	public void withdraw (double amount) { 
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "+number
				+ ", Holder: " + holder
				+ ", Balance: $ " + String.format("%.2f", balance); 
	}

}
