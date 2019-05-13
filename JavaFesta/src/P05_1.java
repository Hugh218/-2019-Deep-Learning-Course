
public class P05_1 {

	public static void main(String[] args) {

		System.out.println(change123(4));
	}

	public static String change123(int i) {

		String answer = "";
		int reminder;

		while (i > 0) {
			reminder = i % 3;
			i /= 3;
			if (reminder == 0) {
				i -= 1;
				reminder = 4;
			}
			answer = reminder + answer;
		}

		return answer;
	}

}
