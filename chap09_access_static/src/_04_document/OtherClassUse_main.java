package _04_document;

// 다른 패키지의 클래스를 사용하려면 import한 후 사용 가능
// import 패키지이름.클래스이름 (클래스 이름은 패키지이름.클래스이름이 원래 클래스 이름)
import _03_bank.Bank;
import _02_Car.*;

public class OtherClassUse_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(9000);
		bank.getBanlance();
		bank.withdraw(5000);
		bank.getBanlance();

		Ambulance  ab = new Ambulance("amCar", "기아");
		System.out.println(ab.model);
		ab.siren();
	}

}
