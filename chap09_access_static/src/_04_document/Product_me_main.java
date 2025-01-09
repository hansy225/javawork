package _04_document;

public class Product_me_main {

	public static void main(String[] args) {
		Product_me p1 = new Product_me("더조은1");
        Product_me p2 = new Product_me("더조은2");
        Product_me p3 = new Product_me("더조은3");

        System.out.println("제품번호: 12345 " + p1.getPro_num());
        System.out.println("제품번호: 23456 " + p2.getPro_num());
        System.out.println("제품번호: 34567 " + p3.getPro_num());
        
        System.out.println("생성된 총 제품 수: " + Product_me.count);
        System.out.println("---------------------");
        
        Product_me p4 = new Product_me("더조은4");
        Product_me p5 = new Product_me("더조은5");
        
        System.out.println("제품번호: 45678 " + p4.getPro_num());
        System.out.println("제품번호: 56789 " + p5.getPro_num());
        
        System.out.println("생성된 총 제품 수: " + Product_me.getCount());
	}

}
