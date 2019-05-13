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
			System.out.print("[1]추가 [2]조회 [3]검색 [4]삭제 >> ");
			menu = sc.nextInt();

			if (menu == 1) {

				mm.insert();
				
				System.out.print("제목 : ");
				title = sc.next();
				System.out.print("가수 : ");
				singer = sc.next();
				System.out.print("재생시간 : ");
				playtime=sc.nextInt();
				
			
			}else if (menu == 2) {
				
			}
		}

	}

}
