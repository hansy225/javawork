package _07_ex;

public interface Product_me {
	void powerOn();
	void powerOff();
	void volume(int vol);
	
	static void talkAi(String message) {
		System.out.println("Ai와 대화중 : " +message);
	}
	void search(String sea);
}
