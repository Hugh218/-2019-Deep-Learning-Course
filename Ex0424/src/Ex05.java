import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매한 귤의 갯수는? >> ");
		int orange = sc.nextInt();
		int number = 52;
		
		int box = orange/number;
		
		System.out.println("김모씨가 귤 박스를 줄 수 있는 박스의 수는 ? "+box);
	}

}
