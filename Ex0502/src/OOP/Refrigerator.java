package OOP;

public class Refrigerator {

	// 문 - 열고 닫고
	// 온도 - 올리고, 내리고

	boolean door = true;
	int temp = 5;

	public boolean doorOC() {
		// System.out.println("문이 열렸습니다.");
		door = !door;
		return door;
	}

	/*
	 * public void doorClose() { System.out.println("문이 닫혔습니다."); }
	 */

	public int tempUp() {
		return ++temp;
	}

	public int tempDown() {
		return --temp;
	}

}
