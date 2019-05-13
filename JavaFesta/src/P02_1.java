//colltaznumber 광요 sol(500일 경우 빠지기 기능추가) 
public class P02_1 {

	public static void main(String[] args) {
		int number = collatznumber(6);
		System.out.println(number);

	}

	public static int collatznumber(int su) {
		int count = 0;
		while (true) {
			if (su % 2 == 0) {
				su /= 2;
				count++;
			} else if (su % 2 != 0) {
				su = su * 3 + 1;
				count++;
			}

			if (su == 1) {
				break;
			} else if (count == 500) {
				su = -1;
				break;
			}

		}

		return count;

	}

}
