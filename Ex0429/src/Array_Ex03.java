import java.util.Arrays;

public class Array_Ex03 {
	public static void main(String[] args) {

		int[] a = { 7, 10, 5, 1, 3, 75, 44, 35, 94, 15 };
		
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			} 
			if (a[i] < min)
			{			
				min = a[i];
			}

		}
		System.out.println(max);
		System.out.println(min);

		Arrays.sort(a);
		
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		System.out.println(Arrays.toString(a));
		
	}
}
