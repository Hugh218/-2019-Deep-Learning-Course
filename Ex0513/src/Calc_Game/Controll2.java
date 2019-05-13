package Calc_Game;

import java.util.Scanner;

public class Controll2 {
	Scanner sc = new Scanner(System.in);
	CD cd;

	Controll2(CD cd) {
		this.cd = cd;
	}

	public void play() {

		String[] errMsg = cd.getErrMsg();

		int life = cd.getlife();

		for (int i = errMsg.length - life; i < errMsg.length;) {
			cd.makeNum();

			System.out.println(cd.getMsg());
			int input = sc.nextInt();

			if (cd.isChecked(input)) {
				System.out.println("success!");
			} else {
				System.out.println(errMsg[i++]);

			}

		}

	}

}
