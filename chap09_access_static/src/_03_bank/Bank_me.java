package _03_bank;

public class Bank_me {
	/*
	 private 잔액 : 필드
	 입금 메서드
	 출금 메서드 (잔액보다 많이 찾으면 안됨)
	 getter메서드 잔액 필드
	 
	 deposit = 입금
	 withdraw = 출금
	 balance = 잔액
	 */

	private int balance;
	
	public Bank_me() {
		this.balance = 0;
	}
	
	public void deposit (int money) {
		if (money>0) {
			balance += money;
			System.out.println(balance + "원이 입금되었습니다.");
		} else {
			System.out.println("입금액은 0원보다 커야합니다.");
		}
	}
	
	public void withdraw (int money) {
		if (money>0 && money<=balance) {
			balance -= money;
			System.out.println(money + "원이 출금되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public int getBalbance () {
		return balance;
	}
	
	
	
}
