import java.util.Arrays;

//mergeArray¸Þ¼Òµå
public class P08 {

	public static int[] mergeArray(int[] a, int[] b) {
		int[] merge = new int[a.length + b.length];

		for(int i =0; i<merge.length; i++ ) {
			if(i<a.length) {
				merge[i] = a[i];
			} else {
				merge[i] = b[i-a.length];
			}
		}

		Arrays.sort(merge);
		return merge;
	}

	public static void main(String[] args) {
		int A[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int B[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int merge[] = mergeArray(A, B);

		System.out.println(Arrays.toString(merge));
	}

}
