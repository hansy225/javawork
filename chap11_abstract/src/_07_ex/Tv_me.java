package _07_ex;

public class Tv_me implements Product_me{
	private boolean on;
	private int volume;
	private int channel;
	private String search;
	
	public Tv_me() {
		this.on = false;
		this.volume = 0;
		this.channel = 0;
		this.search = "";
	}
	
	@Override
	public void powerOn() {
		on = true;
		System.out.println("Tv 전원이 켜졌습니다");
	}

	@Override
	public void powerOff() {
		on = false;
		System.out.println("Tv 전원이 꺼졌습니다");
	}

	@Override
	public void volume(int vol) {
		this.volume += vol;
		System.out.println("현재 볼륨은 : " +this.volume);
	}
	
	public void channel(int cha) {
		this.channel += cha;
		System.out.println("현재 채널은 : " +this.channel);
	}
	
	@Override
	public void search(String sea) {
		this.search = sea;
		System.out.println("검색할 내용 : " +this.search);
	}

	public static void talkAi(String string) {	
	}

}
