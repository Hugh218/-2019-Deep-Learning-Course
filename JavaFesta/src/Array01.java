
public class Array01 {

	public static void main(String[] args) {
		// 입력과 동시에 출력 2차 원배열
		int array[][] = new int[5][5];
		int k = 0;
		int sw = 1;
		for (int i = 0; i < array.length; i++) {
			if (sw == 1) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = ++k;
				}
				sw = -1;
			} else {
				for (int l = array.length - 1; l >= 0; l--) {
					array[i][l] = ++k;
				}
				sw = 1;
			}

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.printf(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
