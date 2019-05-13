import java.util.Scanner;

//입력한 n값만큼 배열 생성  
public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int row, col;
		int i = 0;

		for (row = 0; row < n; row++) {
			for (col = 0; col < n; col++) {
				arr[col][row] = ++i;

			}

		}
		for (row = 0; row < n; row++) {
			for (col = 0; col < n; col++)
				System.out.printf("%3d", arr[row][col]);

			System.out.println();
		}

		sc.close();
	}

}
