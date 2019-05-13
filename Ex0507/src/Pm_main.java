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

		System.out.println("========== 전화번호 관리프로그램 ==========");
		while (true) {
			System.out.print("[1]추가 [2]삭제 [3]검색 [4]전체조회 >> ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.print("이름 : ");
				Name = sc.next();

				System.out.print("나이 : ");
				Age = sc.nextInt();

				System.out.print("전화번호 : ");
				PH = sc.next();

				list.add(new Pm_VO(Name, Age, PH));
				// index++;
				break;

			case 2:
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							list.get(i).getName() + "(" + list.get(i).getAge() + ")세 : " + list.get(i).getPhone());
				}
				System.out.print("삭제할 번호의 인덱스를 입력하세요 >> ");
				int r_index = sc.nextInt();
				list.remove(r_index-1);
				break;

			case 3:
				System.out.print("검색어를 입력하세요 >> ");
				String search = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (search.equals(list.get(i).getName())) {
						System.out.println(
								list.get(i).getName() + "(" + list.get(i).getAge() + ")세 : " + list.get(i).getPhone());
					}
				}

				break;

			case 4:
				System.out.println(list.size());
				for (int i = 0; i < list.size(); i++) {
					System.out.println(
							list.get(i).getName() + "(" + list.get(i).getAge() + ")세 : " + list.get(i).getPhone());
				}

				break;

			default:
				break;
			}

		}

	}

}
