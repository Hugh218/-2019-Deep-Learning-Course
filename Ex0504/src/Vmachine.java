import java.io.ObjectInputStream.GetField;

public class Vmachine {

	public static void main(String[] args) {
		// vending machine ver.OOP_001

		// �ݶ� 1200 4
		// ���� 500
		// Ŀ�� 5500 3

		// System.out.println(title + "�� " + price + "�Դϴ�");
		DrinkVO coke = new DrinkVO(1200, "�ݶ�", 1);
		System.out.println(coke.getState());
		System.out.println(coke);
//		coke.price = 1200;
//		coke.title = "�ݶ�";
//		
//		DrinkVO water = new DrinkVO();
//		water.price = 500;
//		water.title = "����";
//		
//		DrinkVO coffee = new DrinkVO();
//		coffee.price = 5500;
//		coffee.title = "Ŀ��";

		// coke = water;

		// System.out.println(coke.title);
		// System.out.println(water.price);

//		coke.setPrice(1200);
//		coke.setStock(4);
//	
//		
//		System.out.println(coke.getPrice());
		// �ݵ�� ���� �����ؾ��ϴ� �����Ϳ� ���ؼ�
		// �������� ����. >> ������
		// 1. �Ϲݸ޼ҵ� >> ȣ�� ��, but, ������>> ��ü�� ���鶧.
		// 2. �̸��� Ŭ������ �̸��� ����.
		// 3. ��ȯ���� ����.
		//

	}

}
