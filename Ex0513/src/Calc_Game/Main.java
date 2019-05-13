package Calc_Game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 범위를 입력하세요 >> ");
		int max =sc.nextInt() ;
		String[] errMsg = { "어휴..", "에휴..", "???...", "한번만 더..", "GameOver!" };
		System.out.print("사용자의 목숨을 입력하세요 >> ");
		int life = sc.nextInt();
//		System.out.print("부호를 입력하세요");
//		String oper = sc.next();
		
		System.out.println("Plus");
		new Controll(new PlusCD(max,errMsg,life)).play();
		System.out.println("Minus");
		new Controll(new MinusCD(max,errMsg,life)).play(); //minus game;

		

	}

}
