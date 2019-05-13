import java.util.Scanner;

public class Array_Ex05 {

	public static void main(String[] args) {
		int[] array = new int[10];

		Scanner sc = new Scanner(System.in);
		int i;
		for (i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		System.out.print("3의배수 : ");
		for (i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
