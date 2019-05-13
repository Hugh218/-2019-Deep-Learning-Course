//피보나치 재귀함수(n번째항은 항상 n-2항과 n-1항의 합이다.)
public class P20 {

	public static void main(String[] args) {
		int input = 8;

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	public static int fibo(int i) {
		// TODO Auto-generated method stub
		if (i <= 1) {
			return i;
		} else
			return fibo(i - 2) + fibo(i - 1);
	}

}
