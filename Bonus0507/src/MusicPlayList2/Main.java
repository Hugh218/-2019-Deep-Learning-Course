package MusicPlayList2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String title = "";
		String singer = "";
		int playtime = 0;
		
		MusicManager mm = new MusicManager();
		
		while (true) {
			System.out.println("=========== MUSIC ===========");
			System.out.print("[1]�߰� [2]��ȸ [3]�˻� [4]���� >> ");
			menu = sc.nextInt();

			if (menu == 1) {

				mm.insert();
				
				System.out.print("���� : ");
				title = sc.next();
				System.out.print("���� : ");
				singer = sc.next();
				System.out.print("����ð� : ");
				playtime=sc.nextInt();
				
			
			}else if (menu == 2) {
				
			}
		}

	}

}
