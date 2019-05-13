package Pickture;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//그림판 만들기. 
		//(1)삽입 (2)삭제 (3)모두보기
		GraphicTool gt = new GraphicTool();
		Scanner sc = new Scanner(System.in);
		System.out.println("(1)삽입 (2)모두보기");
		int choice = sc.nextInt();
		while(true) {
			if(choice == 1) { 
				System.out.print("[1]Rect [2]Cir [3]Tri >> ");
	            int num = sc.nextInt();
	            System.out.print("color >> ");
	            String color = sc.next();
	            Shape sh = null;
	            
	            if (num == 1) {
	               sh = new Rect(color);
	            }else if (num == 2) {
	               sh = new Circle(color);
	            }else if (num == 3) {
	               sh = new Tri(color);
	            }
	            
	            gt.addShape(sh);

			} else if (choice == 2) {
				System.out.println();
				 gt.allDraw();

				
				
				
				
				
			} else {
				System.out.println("범위내 번호를 입력하세요.");
				break;
			}
		}
	}

}
