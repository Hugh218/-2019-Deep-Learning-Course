package eX0503;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		

		
		// 사람이름 5개를 입력받아서 배열에 저장.
		String name[] = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "번 >> ");
			name[i] = sc.next();
			
		}
		System.out.println(Arrays.toString(name));
		System.out.print("찾고싶은 사람의 이름을 작성하세요 >> ");
		String find = sc.next();
		find2(name, find);
		
		
		sc.close();
	}

	public static int find2(String name[],String find) {
		
		//int locate = 0;
		for (int i = 0; i < name.length; i++) {
			
			if (find.equals(name[i])) {
				//locate = i + 1;
				return i;
			}
		}
		return -1;
		
//		if (locate != 0) {
//			System.out.println(locate + "번째에 있습니다.");
//		} else {
//			System.out.println("존재하지 않습니다.");
//
//		}
		

		
	}

}
