
public class Array02 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = ++cnt;
				}
			} else {
				for (int j = array.length - 1; j >= 0; j--) {
					array[i][j] = ++cnt;
				}
			}
		}
		
		for(int i=0;i<array.length; i++ ) {
			for(int j =0; j<array.length; j++ ) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
