package _04_document;

public class Product {
	/*
	 교유의 제품번호 (더조은1)
	 제품의 갯수(객체가 생성된 갯수)
	 생성자 (고유한 제품번호)
	 */
	String pro_num;
	static int count;
	
	Product (String pro_num) {
		this.pro_num = pro_num;
		count++;
	}
	
	String getPro_num () {
		return pro_num;
	}
	
	static int getCount () {
		return count;
	}
	

	
}
