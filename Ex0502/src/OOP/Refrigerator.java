package OOP;

public class Refrigerator {

	// �� - ���� �ݰ�
	// �µ� - �ø���, ������

	boolean door = true;
	int temp = 5;

	public boolean doorOC() {
		// System.out.println("���� ���Ƚ��ϴ�.");
		door = !door;
		return door;
	}

	/*
	 * public void doorClose() { System.out.println("���� �������ϴ�."); }
	 */

	public int tempUp() {
		return ++temp;
	}

	public int tempDown() {
		return --temp;
	}

}
