//2차원 배열 회전
public class P10 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int row, col;
		int i = 1;

		for (row = 0; row < 5; row++) {
			for (col = 0; col < 5; col++) {
				a[row][col] = i++;
			}
		}

		for (row = 0; row < 5; row++) {
			for (col = 0; col < 5; col++) {
				System.out.printf("%3d", a[row][col]);
			}
			System.out.println();
		}

		System.out.println();
		for (row = 0; row < 5; row++) {
			for (col = 0; col < 5; col++) {
				b[row][col] = a[col][4 - row];
			}

		}
		
		System.out.println();
		for (row = 0; row < 5; row++) {
			for (col = 0; col < 5; col++) {
				a[row][col] = b[col][4 - row];
			}

		}

		for (row = 0; row < 5; row++) {
			for (col = 0; col < 5; col++) {
				System.out.printf("%3d", a[row][col]);
			}
			System.out.println();
		}

	}

}
