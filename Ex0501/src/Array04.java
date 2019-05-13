
public class Array04 {

	public static void main(String[] args) {
		int array[][] = new int[5][5];

		int start = 0;
		int end = 4;
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			if (i <= 2) {
				for (int j = start; j <= end; j++) {
					array[i][j] = cnt++;
				}
				if (start != 2) {
					start++;
					end--;
				}
			} else {
				start--;
				end++;
				for (int j = start; j <= end; j++) {
					array[i][j] = cnt++;
				}

			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}

	}

}
