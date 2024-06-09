package day1_Exe;

public class BankAccount {
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(10000.00);
		account1.displayBalance();
		account1.deposit(7000.00);
		account1.displayBalance();
		account1.withdraw(8000.57);
		account1.displayBalance();
	}
	
	
	
  private double balance;
  
  public BankAccount(double initialBalance) {
	  this.balance=initialBalance;
  }
  
  public void deposit(double amount) {
	  this.balance+=amount;
  }
  
  public void withdraw(double amount) {
	  this.balance-=amount;
  }
  
  public double getBalance() {
	  return this.balance;
  }
  
  public void displayBalance() {
	  System.out.println("Balance is : "+balance);
  }
  

}
