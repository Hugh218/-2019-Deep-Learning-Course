import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int kind = 0;
		int jan_aeg = 0;
		int cola = 800;
		int water = 500;
		int bita = 1500;
		String choice = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� >> ");
		int money = sc.nextInt();

		while (true) {
			System.out.println("1.�ݶ�(800) 2.����(500) 3.��Ÿ�ο���(1500) >> ");
			kind = sc.nextInt();

			switch (kind) {
			case 1:
				if (money < cola) {
					System.out.println("�ܾ��� �����մϴ�");
					break;
				}
				System.out.println("�ݶ� ���ɴϴ�.");
				money = money - cola;

				break;
			case 2:
				if (money < water) {
					System.out.println("�ܾ��� �����մϴ�");
					break;
				}
				System.out.println("������ ���ɴϴ�.");
				money = money - water;

				break;
			case 3:
				if (money < bita) {
					System.out.println("�ܾ��� �����մϴ�");
					break;
				}
				System.out.println("��Ÿ�����ᰡ ���ɴϴ�.");
				money = money - bita;

				break;
			}

		}

	}
}

/*
 * } System.out.println("����Ͻðڽ��ϱ�?"); choice = sc.next(); if(choice.equals("n"))
 * { break; }
 * 
 * 
 * }
 */
//		 else {
//			
//			
//			
//			System.out.println("����Ͻðڽ��ϱ�?");
//			
//			
//		}

//
//
//
//
//
//
//
//
//int chun = 0;
//int five = 0;
//int hund = 0;
//
//if ( jan_aeg < kind) {
//	System.out.println("���� �����ؿ�");
//}
////�ܾ��� ���� ���ݺ��� ������ ����
//jan_aeg = money;
//while (jan_aeg < water) {
//	break;
//}
//
//
//}
//
////����� �ܾ��� õ,����,�� ���� ���
//chun = jan_aeg/1000;
//five = (jan_aeg - chun*1000)/500;
//hund = (jan_aeg-chun*1000-five*500)/100;
//
