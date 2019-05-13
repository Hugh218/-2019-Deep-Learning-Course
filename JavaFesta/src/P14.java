import java.util.Arrays;
import java.util.Random;

//최대/최소값 출력
public class P14 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		Random rd = new Random();
		System.out.println("배열에 있는 모든 값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("가장 큰 값 : " + arr[arr.length - 1]);
		System.out.println("가장 작은 값 : " + arr[0]);

	}

}
