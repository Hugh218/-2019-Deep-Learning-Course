package Reservation;

import java.util.Date;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		// TODO Auto-generated method stub
		System.out.println("=======MemberSystem=======");
		System.out.print("[1]JOIN [2]LOGIN");
		int input = sc.nextInt();
		
		if(input == 1) {
			System.out.print("ID : ");
			String id = sc.next();
			
			System.out.print("PW : ");
			String pw = sc.next();
			
			System.out.print("BIRTH("+date+") : ");
			String birth = sc.next();
			
			
		}
		
	}

}
