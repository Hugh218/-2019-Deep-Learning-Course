
// �ߺ����� ���ڸ� �̴� �ζ� ���α׷�
import java.util.Random;

public class P01 {

	public static void main(String[] args) {

		Random rand = new Random();
		int i, j;
		int[] number = new int[6];
		for (i = 0; i < number.length; i++) {
			number[i] = rand.nextInt(45) + 1;
			for (j = 0; j < i; j++) {
				if (number[j] == number[i]) {
					i--;
					break;
				}
			}
		}

		for (i = 0; i < number.length; i++) {
			System.out.println("����� ����: " + number[i]);
		}
	}

}
