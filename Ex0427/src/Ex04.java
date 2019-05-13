
public class Ex04 {

	public static void main(String[] args) {
		
		for (int j = 1; j < 10; j++) {
		
//			System.out.println("2*" + i + "=" + 2 * i);
			for (int i = 2; i < 10; i++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
	}

}

// 가로형태로 변환하여 출력하세요 .