package _02_Car;

public class Car_main {

	public static void main(String[] args) {
		Ambulance am1 = new Ambulance("amCar", "기아");
	
		am1.power();
		
		System.out.println("현재 속도 : " +am1.SpeedUp());  // 5
		System.out.println("현재 속도 : " +am1.SpeedUp());  // 10
		
		am1.siren();
		am1.firstAid();
		
		am1.siren();
		am1.power();

	}

}
