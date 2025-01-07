package _03_ex;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("Galaxy", "Black");
		
		sp.search();
		System.out.println("----------------");

        sp.bell();
        sp.hangup();
        sp.hangout();
        System.out.println("----------------");
        
        sp.bell = false;
        sp.bell();
        sp.hangup();
        System.out.println("----------------");

        sp.sendvoice();
        sp.recevevoice();
		
	}

}
