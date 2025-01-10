package _04_polyBuyerArrayList;

import java.util.ArrayList;

public class Buyer {
	int money = 500;
	int bonusPoint;
	ArrayList<Product> cart = new ArrayList<Product>();
	int index = 0;
	
	void buy(Product p) {  // b.buy(New Tv())
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p);
		System.out.println(p + "를 구입함");
	}
	
	void getInfo () {
		int sum = 0;
		String list = "";
		
		if (cart.isEmpty()) {
			System.out.println("구입한 물품이 없습니다");
			return;
		}
		for (int i=0; i<cart.size(); i++) {  // size : 데이터가 들어있는 갯수만 가져옴. 총 갯수와는 상관없음
//			if(cart[i]==null) {
//				break;
//			}  --> if문 넣을 필요 없음
			Product p1 = cart.get(i);
			sum += p1.price;
			System.out.print(p1 +", ");
		}
		System.out.println("구입한 물품의 합계 : " +sum +"만원입니다.");
		System.out.println("구입한 목록 품목 : " +list);
	}
	
	void refund (Product p) {
		if (cart.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p +"반품");
		} else {
			System.out.println("구입하지 않은 상품입니다");
		}
	}
	
}


