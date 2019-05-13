import java.util.Random;

public class P28 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] array = new int[8][8];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = rand.nextInt(99) + 1;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.printf("%3d", array[i][j]);
			}
			System.out.println();
		}

	}

}
