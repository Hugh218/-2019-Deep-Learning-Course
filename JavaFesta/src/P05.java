//1,2,4 진법 변환 . 

public class P05 {

	public static void main(String[] args) {
		System.out.println(change124(5));

	}

	public static String change124(int number) {

		String answer = "";
		int reminder;

		while (number > 0) {
			reminder = number % 3;
			number = number / 3;
			if (reminder == 0) {
				number -= 1;
				reminder = 4;
			}
			answer = reminder + answer;
		}

		return answer;

	}

}
