package T01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactMN mn = new ContactMN();

		while (true) {
			System.out.println("[1]추가 [2]삭제  [3]검색 [4]전체조회");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("연락처 : ");
				String number = sc.next();

				mn.addNumber(name, age, number);
				
			} else if (choice == 2) {

				
				
			} else if (choice == 3) {
				System.out.print("이름 : ");
				String name = sc.next();
				ContactVO temp = mn.search(name);
				
				if(temp == null) {
					System.out.println("not found!");
				} else {
					System.out.println(temp);
				}
				
			} else if (choice == 4) {
				ArrayList<ContactVO> temp = mn.getAllNumber();
				for(int i =0; i<temp.size();i++) {
					System.out.println(temp.get(i).toString());
					
				}
				
			}

		}

	}

}
