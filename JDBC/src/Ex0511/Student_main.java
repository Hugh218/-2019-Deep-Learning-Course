package Ex0511;

import java.util.Scanner;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student_DAO Sdao = new Student_DAO();
		
		while (true) {
			System.out.println("============성적 관리 프로그램============");
			System.out.println("[1]추가 [2]삭제 [3]전체 검색 [4]검색 [5]종료");

			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학번 : ");
				String num = sc.next();
				System.out.print("자바 점수 : ");
				int javaScore = sc.nextInt();
				System.out.print("웹점수 : ");
				int webScore = sc.nextInt();
				System.out.print("데이터베이스 점수 : ");
				int dbScore = sc.nextInt();

				Sdao.getConn();
				Sdao.insert(name,num,javaScore,webScore,dbScore);
				
				
				
				
			} else if (choice == 2) {

			} else if (choice == 3) {

			} else if (choice == 4) {

			} else if (choice == 5) {

			} else {

			}
		}
	}

	

}
