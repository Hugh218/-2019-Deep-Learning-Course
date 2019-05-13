package Chicken;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Super store1 = new Super();

		//store1.makeChic();

		Super store2 = new Sub1();
		store2.makeChic();
		((Sub1) store2).makePizza();

		Super store3 = new Sub2();
		store3.makeChic();
		((Sub2) store3).cheese();

	}

}
