import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		int cnt = 1; // 값이 있는 값의 증가치
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수 n값을 입력하세요 : ");
		int n = sc.nextInt();
		int array[][] = new int[n][n];
		int start = n/2, end = n/2;
		

		for (int i = 0; i < array.length; i++) {
			if (i <= n/2) {
				for (int j = end; j >= start; j--) {
					array[j][i] = cnt++;

				}
				if (start != 0) {
					start--;
					end++;
				}

			} else {
				++start;
				--end;
				for (int j = end; j >= start; j--) {
					array[j][i] = cnt++;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
