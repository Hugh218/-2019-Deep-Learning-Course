package MusicPlayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MusicManager mm = new MusicManager();
	 
		
		
		int menu = 0;
		while (true) {
			System.out.println("============= MUSIC =============");
			System.out.println("[1]�߰� [2]��ȸ [3]�˻� [4]���� >> ");
			menu = sc.nextInt();
			
			switch (menu) {
			// �߰�
			case 1:
			
				System.out.print("���� : ");
				String title = sc.next();
				System.out.print("���� : ");
				String singer = sc.next();
				System.out.print("����ð� : ");
				int playtime = sc.nextInt();

				mm.insertmenu(title, singer, playtime);
				
				break;

			case 2:
				mm.AllFind();
				break;

			case 3:
				String str = sc.next();
				mm.search(str);
				break;

			case 4:
			
				mm.AllFind();
				System.out.print("�ε��� : ");
				int n1 = sc.nextInt();
				mm.delete(n1);
				
				break;

			default:
				
				break;
			}

		}

	}

}
