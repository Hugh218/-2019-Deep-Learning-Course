package eX0503;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		

		
		// ����̸� 5���� �Է¹޾Ƽ� �迭�� ����.
		String name[] = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + 1 + "�� >> ");
			name[i] = sc.next();
			
		}
		System.out.println(Arrays.toString(name));
		System.out.print("ã����� ����� �̸��� �ۼ��ϼ��� >> ");
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
//			System.out.println(locate + "��°�� �ֽ��ϴ�.");
//		} else {
//			System.out.println("�������� �ʽ��ϴ�.");
//
//		}
		

		
	}

}
