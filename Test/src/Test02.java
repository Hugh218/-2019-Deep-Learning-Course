import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���������� �迭 ���� �ְ�
		System.out.println("�γ� : �Ŀ������� ������ؼ���... ��ǻ�Ϳ��� ����ºο��� �̰ܾ� �Ѵ�... ");
		System.out.println("�γ� : ��ǻ�Ϳ��� ������������ �Ͽ� �̰ܶ�");
		System.out.println("�γ� : 3�� ���� �¸��Ѵٸ� �Ŀ� ������ ������ �� ���� ���̴�...");

		// ���Ϳ� ���� �¸� Ƚ��

		int cntCom = 0;
		int cntUser = 0;

		String[] rsp = { "����", "����", "��" };

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int rand_cnt = rand.nextInt(3);

		while (cntUser <= 3) {
			System.out.print("����, ����, �� �� �ϳ��� �Է��ض� >> ");
			String input = rand.toString();

			switch (input) {
			case "����":
				if (rsp[rand_cnt] == input) {
					System.out.println("���º�!");
				} else if (rsp[rand_cnt] == "����") {
					cntCom++;
					System.out.println("���� " + cntCom + "��!");
				} else if (rsp[rand_cnt] == "��") {
					cntUser++;
					System.out.println("����� " + cntUser + "��!");
				}
				break;

			case "����":
				if (rsp[rand_cnt] == "����") {
					System.out.println("���º�!");
				} else if (rsp[rand_cnt] == "��") {
					cntCom++;
					System.out.println("���� " + cntCom + "��!");
				} else if (rsp[rand_cnt] == "����") {
					cntUser++;
					System.out.println("����� " + cntUser + "��!");
				}
				break;

			case "��":
				if (rsp[rand_cnt] == "��") {
					System.out.println("���º�!");
				} else if (rsp[rand_cnt] == "����") {
					cntCom++;
					System.out.println("���� " + cntCom + "��!");
				} else if (rsp[rand_cnt] == "����") {
					cntUser++;
					System.out.println("����� " + cntUser + "��!");
				}
				break;

			}
		}
		System.out.println("�Ŀ������� ���� �ڰ��� ����ϴ�...");

	}

}
