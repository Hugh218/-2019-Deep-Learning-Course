import java.util.Arrays;
import java.util.Random;

//�ִ�/�ּҰ� ���
public class P14 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		Random rd = new Random();
		System.out.println("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("���� ū �� : " + arr[arr.length - 1]);
		System.out.println("���� ���� �� : " + arr[0]);

	}

}
