import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class Pm_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		String Name = "";
		int Age = 0;
		String PH = "";

		ArrayList<Pm_VO> list = new ArrayList<Pm_VO>();
		Pm_VO vo = new Pm_VO(Name, Age, PH);
		int index = 0;

		System.out.println("========== ��ȭ��ȣ �������α׷� ==========");
		while (true) {
			System.out.print("[1]�߰� [2]���� [3]�˻� [4]��ü��ȸ >> ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.print("�̸� : ");
				Name = sc.next();

				System.out.print("���� : ");
				Age = sc.nextInt();

				System.out.print("��ȭ��ȣ : ");
				PH = sc.next();

				list.add(new Pm_VO(Name, Age, PH));
				// index++;
				break;

			case 2:
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							list.get(i).getName() + "(" + list.get(i).getAge() + ")�� : " + list.get(i).getPhone());
				}
				System.out.print("������ ��ȣ�� �ε����� �Է��ϼ��� >> ");
				int r_index = sc.nextInt();
				list.remove(r_index-1);
				break;

			case 3:
				System.out.print("�˻�� �Է��ϼ��� >> ");
				String search = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (search.equals(list.get(i).getName())) {
						System.out.println(
								list.get(i).getName() + "(" + list.get(i).getAge() + ")�� : " + list.get(i).getPhone());
					}
				}

				break;

			case 4:
				System.out.println(list.size());
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							list.get(i).getName() + "(" + list.get(i).getAge() + ")�� : " + list.get(i).getPhone());
				}

				break;

			default:
				break;
			}

		}

	}

}
