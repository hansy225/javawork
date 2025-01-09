package _02_Car;

public class Car {
	public String model;
	String company;
	boolean power;
	int speed;
	
	public Car (String model, String company) {
		this.model = model;
		this.company = company;
	}

	void power () {
		if (power = !power)
			System.out.println("시동을 켭니다");
		else
			System.out.println("시동을 끕니다");
	}
	
	int SpeedUp () {
		speed += 5;
		return speed;
	}

}
