//�Ǻ���ġ ����Լ�(n��°���� �׻� n-2�װ� n-1���� ���̴�.)
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
