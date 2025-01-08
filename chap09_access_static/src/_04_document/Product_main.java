package _04_document;

public class Product_main {

	public static void main(String[] args) {
		Product product1 = new Product("더조은1");
        Product product2 = new Product("더조은2");
        Product product3 = new Product("더조은3");

        System.out.println("제품번호: 12345 " + product1.getPro_num());
        System.out.println("제품번호: 23456 " + product2.getPro_num());
        System.out.println("제품번호: 34567 " + product3.getPro_num());
        
        System.out.println("생성된 총 제품 수: " + Product.getCount());
	}

}
