import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int i=0;
		for (i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "��° �Է� >> ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("�Է��� ���ڴ�? ");
		for(i =0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

		System.out.println("�Էµ� ����"+Arrays.toString(a));
		
		//������ �ְ�/���� ���� ���. 
		Arrays.sort(a);
		
		System.out.println(a[a.length-1]);
		System.out.println(a[0]);
		
		// ���հ� ����� ���Ͻÿ�.
		int sum = 0;
		double avg = 0.0;
		for ( i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		avg = (double) sum / a.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

}
