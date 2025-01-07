package _03_ex;

public class Phone {
	String model;
	String color;
	boolean bell;
	boolean hangup;
	boolean hangout;
	String sendvoice;
	String recevevoice;
	
	Phone (String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	 void bell() {
	        if (bell = !bell)
	            System.out.println("전화벨이 울린다");
	        else
	            System.out.println("전화벨이 멈춘다");
	    }

	    void hangup() {
	        if (hangup = !hangup)
	            System.out.println("전화를 받는다");
	        else
	            System.out.println("전화를 받지 않는다");
	    }

	    void hangout() {
	        if(hangout = !hangout)
	            System.out.println("전화를 끊는다");
	        else
	            System.out.println("전화를 끊지않는다");
	    }

	    void sendvoice() {
	        System.out.println("메시지를 보낸다");
	    }

	    void recevevoice() {
	        System.out.println("메시지를 받는다");
	    }
	
}
