import java.util.Scanner;

public class P25 {
	public static boolean isharshad(int x) {
		int sum =0;
		int tmpX = x; 
		while (tmpX !=0) {
			sum += tmpX % 10;
			tmpX /= 10;
		}
		
		return x % sum == 0 ? true : false;
	}
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();

		isharshad(18);
	}

}
