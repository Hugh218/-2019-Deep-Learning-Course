import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ :");
		int curWeight = sc.nextInt();
		int golWeight = 0;
		while (true) {
			System.out.print("��ǥ ������ :");
			golWeight = sc.nextInt();
			if (golWeight > curWeight) {
				System.out.println("�ٽ� �Է��ϼ���");
			} else {
				break;
			}

		}

		int loss = 0;
		int weak = 0;

		while (true) {

			weak++;
			System.out.println(weak + "���� ���� ������");
			loss = sc.nextInt();
			curWeight -= loss;

			if (curWeight <= golWeight) {
				System.out.println(curWeight + "kg �޼�!! �����մϴ�!");
				break;

			}

		}

	}

}
