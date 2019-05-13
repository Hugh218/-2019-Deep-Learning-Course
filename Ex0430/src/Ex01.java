
public class Ex01 {

	public static void main(String[] args) {
		int[] startcount = { 3, 4, 4, 2, 1 };

		for (int j = 0; j < startcount.length; j++) {
			System.out.print(startcount[j] + ":");
			for (int i = 0; i < startcount[j]; i++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
