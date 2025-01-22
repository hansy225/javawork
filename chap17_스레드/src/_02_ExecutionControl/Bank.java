package _02_ExecutionControl;

public class Bank {
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance>=money) {
			System.out.println("잔액 부족");
		}
			try {
				Thread.sleep(money);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}

}
