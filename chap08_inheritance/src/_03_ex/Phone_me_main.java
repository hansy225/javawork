package _03_ex;

public class Phone_me_main {

	public static void main(String[] args) {
		SmartPhone_me sp = new SmartPhone_me();
		
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
