// 77*1 ~ 1*77 ±îÁö ÇÕ
public class P19 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 77;
		for (int i = 1; i <= 77; i++) {
			sum += i*num;
			num--;
		}
		System.out.println(sum);
	}

}
