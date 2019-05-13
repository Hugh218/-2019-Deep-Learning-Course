
public class Sort1 {

	public static void main(String[] args) {
		int temp = 0;
		int arr1[] = new int[] { 8, 5, 1, 4, 3 };

		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - i - 1; j++)
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
