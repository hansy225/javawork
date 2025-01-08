package _03_bank;

public class Bank_me_main {
	public static void main(String[] args) {
		Bank_me bank = new Bank_me();
		
		bank.deposit(0);
		System.out.println("-----------------------");
		
		bank.deposit(10000);
		System.out.println("현재 잔액은 " + bank.getBalbance() + "원 입니다.");
		System.out.println("-----------------------");
		
		bank.withdraw(5000);
		System.out.println("현재 잔액은 " + bank.getBalbance() + "원 입니다.");
		System.out.println("-----------------------");
		
		bank.withdraw(6000);
		System.out.println("현재 잔액은 " + bank.getBalbance() + "원 입니다.");
		
		
	}

}
