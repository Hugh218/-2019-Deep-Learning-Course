//가운데 글자 출력

public class P18 {
	public static String getMiddle(String a) {
		String word = a;
		String[] array_word;
		String result = "";
		array_word = word.split("");

		if (array_word.length % 2 == 0) {
			result = array_word[(array_word.length / 2 - 1)] + array_word[(array_word.length / 2)];
		} else {
			result = array_word[(array_word.length / 2)];
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(getMiddle("test"));
	}

}
