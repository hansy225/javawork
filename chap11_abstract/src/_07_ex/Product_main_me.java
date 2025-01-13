package _07_ex;

public class Product_main_me {

	public static void main(String[] args) {
		
		// Product product = new Product(); --> 인스턴스를 생성할 수 없음
		// Product인스턴스를 직접 생성할 수 없으므로 tv나 game 클래스를 사용해야 함
		
		Product_me.talkAi("오늘 날씨 어때 ?");
		System.out.println("-------------------------");
		
		Tv_me tv = new Tv_me();
		tv.powerOn();
		tv.volume(10);
		tv.channel(50);
		
		tv.search("인기있는 예능프로");
		
		tv.powerOff();
		System.out.println("-------------------------");
		
		Game_me game = new Game_me();
		game.powerOn();
		game.volume(15);
		game.changeGame("오버워치");
		game.powerOff();

	}

}
