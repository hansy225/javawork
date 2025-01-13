package _02_userException;

public class Bank {
	private int balance;
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws UserException{
		if(balance >= money)
			balance -= money;
		else
			throw new UserException("잔고부족 : " +(money-balance) +"모자람");
	}
	
	public void getBanlance() {
		System.out.println("잔액 : " + balance);
	}
}