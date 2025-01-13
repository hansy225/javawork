package _07_ex;

public class Game_me implements Product_me{
	private boolean on;
	private int volume;
	private String changeGame;
	
	public Game_me() {
		this.on = false;
		this.volume = 0;
		this.changeGame = "";
	}
	
	@Override
	public void powerOn() {
		on = true;
		System.out.println("게임기 전원이 켜졌습니다");
	}

	@Override
	public void powerOff() {
		on = false;
		System.out.println("게임기 전원이 꺼졌습니다");
	}

	@Override
	public void volume(int vol) {
		this.volume += vol;
		System.out.println("현재 볼륨은 : " +this.volume);
	}
	
	public void changeGame(String ga) {
		this.changeGame = ga;
		System.out.println(this.changeGame+ "로 변경합니다");
	}

	@Override
	public void search(String sea) {

	}
}
