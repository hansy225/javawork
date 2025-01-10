package _03_polyBuyerArray;

public class Buyer {
	int money = 500;
	int bonusPoint;
	int index = 0;
	
	Product[] cart = new Product[10]; 

	void buy(Product p) {  // b.buy(New Tv())
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[index++] = p;
		System.out.println(p + "를 구입함");
	}
	
//	void getInfo () {
//		int sum = 0;
//		System.out.print("구입한 물품 목록 : ");
//		
//		for (int i=0; i<cart.length; i++) {
//			if(cart[i]==null) {
//				break;
//			}
//			sum += cart[i].price;
//			System.out.print(cart[i] +", ");
//		}
//		System.out.println();
//		System.out.println("구입한 물품의 합계 : " +sum +"만원입니다.");
//	}
	
	void getInfo () {
		int sum = 0;
		String list = "";
		
		for (int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				break;
			}
			sum += cart[i].price;
			System.out.print(cart[i] +", ");
		}
		System.out.println("구입한 물품의 합계 : " +sum +"만원입니다.");
		System.out.println("구입한 목록 품목 : " +list);
	}
}


