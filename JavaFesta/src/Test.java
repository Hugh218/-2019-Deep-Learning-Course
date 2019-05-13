
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				a = i * (-1);
				sum += a;
				System.out.print(a + " ");
			}

			if (i % 2 == 1) {
				a = i;
				sum += a;
				System.out.print(a + " ");
			}
//			System.out.println();

		}
		System.out.println();
		System.out.print("°á°ú : " + sum );

	}

}
