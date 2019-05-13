package Calc_Game;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		String[] fail = { "바보", "멍청이", "똥개", "말미잘", "바보2" };
		int life = 5;
		int ans = 0;
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		while (true) {
			if (life == 0) {
				break;
			}

			num1 = (int) (Math.random() * 10);
			num2 = (int) (Math.random() * 10);
			sum = num1 + num2;
			
			System.out.println("====== PLUS GAME ======");
			System.out.println(num1 + "+" + num2 + "=");
			ans = sc.nextInt();
			
			if (sum != ans) {
				life--;
				System.out.println("Fail" + fail[(int) Math.random() * 5]);
				
			} else {
				System.out.println("SUCCESS!");
				
			}
		}

	}

}
