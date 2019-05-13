import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int i=0;
		for (i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("입력한 숫자는? ");
		for(i =0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

		System.out.println("입력된 정수"+Arrays.toString(a));
		
		//정렬후 최고/최하 점수 출력. 
		Arrays.sort(a);
		
		System.out.println(a[a.length-1]);
		System.out.println(a[0]);
		
		// 총합과 평균을 구하시오.
		int sum = 0;
		double avg = 0.0;
		for ( i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		avg = (double) sum / a.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
