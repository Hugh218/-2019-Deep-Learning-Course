import java.io.ObjectInputStream.GetField;

public class Vmachine {

	public static void main(String[] args) {
		// vending machine ver.OOP_001

		// 콜라 1200 4
		// 생수 500
		// 커피 5500 3

		// System.out.println(title + "은 " + price + "입니다");
		DrinkVO coke = new DrinkVO(1200, "콜라", 1);
		System.out.println(coke.getState());
		System.out.println(coke);
//		coke.price = 1200;
//		coke.title = "콜라";
//		
//		DrinkVO water = new DrinkVO();
//		water.price = 500;
//		water.title = "생수";
//		
//		DrinkVO coffee = new DrinkVO();
//		coffee.price = 5500;
//		coffee.title = "커피";

		// coke = water;

		// System.out.println(coke.title);
		// System.out.println(water.price);

//		coke.setPrice(1200);
//		coke.setStock(4);
//	
//		
//		System.out.println(coke.getPrice());
		// 반드시 값을 지정해야하는 데이터에 대해서
		// 강제성을 주자. >> 생성자
		// 1. 일반메소드 >> 호출 시, but, 생성자>> 객체를 만들때.
		// 2. 이름이 클래스의 이름과 같다.
		// 3. 반환형이 없음.
		//

	}

}
