
public class Ex01 {
	public static void main(String[] args) {
		String[] subject = { "국어", "영어", "수학" };
		int[] score = { 85, 74, 60 };

		for (int i = 100; i > 0; i++) {
			System.out.print(i + "\t");
			for (int j = 0; j < score.length; j++) {
				if(score[j]>i) {
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
		System.out.println("과목\t국어\t영어\t수학");

	}
}
