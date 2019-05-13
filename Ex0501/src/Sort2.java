
public class Sort2 {

	public static void main(String[] args) {
		int array[] = new int[] { 8, 5, 1, 4, 3 };
		int min;
		int temp;
		int locate = 0;
		for (int i = 0; i < array.length - 1; i++) {
			min = array[i];
			for (int j = i; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					locate = j;

					temp = array[i];
					array[i] = array[locate];
					array[locate] = temp;

				}

			}

			/*
			 * temp = array[i]; array[i] = array[locate]; array[locate] = temp;
			 */
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
