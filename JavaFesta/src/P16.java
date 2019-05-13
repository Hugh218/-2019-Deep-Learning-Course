//1-2+3-4+....+99-100을 계산 출력
public class P16 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
				System.out.print(i + " ");
			} else {
				sum = sum + i * -1;
				System.out.print(i*(-1) + " ");
			}
			

		}
		System.out.println();
		System.out.println("결과 : " + sum);
	}

}
