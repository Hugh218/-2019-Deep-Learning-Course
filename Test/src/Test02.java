import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보 배열 랜덤 넣고
		System.out.println("로난 : 파워스톤을 얻기위해서는... 컴퓨터와의 정면승부에서 이겨야 한다... ");
		System.out.println("로난 : 컴퓨터와의 가위바위보를 하여 이겨라");
		System.out.println("로난 : 3번 먼저 승리한다면 파워 스톤을 차지할 수 있을 것이다...");

		// 컴터와 나의 승리 횟수

		int cntCom = 0;
		int cntUser = 0;

		String[] rsp = { "가위", "바위", "보" };

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int rand_cnt = rand.nextInt(3);

		while (cntUser <= 3) {
			System.out.print("가위, 바위, 보 중 하나를 입력해라 >> ");
			String input = rand.toString();

			switch (input) {
			case "가위":
				if (rsp[rand_cnt] == input) {
					System.out.println("무승부!");
				} else if (rsp[rand_cnt] == "바위") {
					cntCom++;
					System.out.println("나의 " + cntCom + "승!");
				} else if (rsp[rand_cnt] == "보") {
					cntUser++;
					System.out.println("당신의 " + cntUser + "승!");
				}
				break;

			case "바위":
				if (rsp[rand_cnt] == "바위") {
					System.out.println("무승부!");
				} else if (rsp[rand_cnt] == "보") {
					cntCom++;
					System.out.println("나의 " + cntCom + "승!");
				} else if (rsp[rand_cnt] == "가위") {
					cntUser++;
					System.out.println("당신의 " + cntUser + "승!");
				}
				break;

			case "보":
				if (rsp[rand_cnt] == "보") {
					System.out.println("무승부!");
				} else if (rsp[rand_cnt] == "가위") {
					cntCom++;
					System.out.println("나의 " + cntCom + "승!");
				} else if (rsp[rand_cnt] == "바위") {
					cntUser++;
					System.out.println("당신의 " + cntUser + "승!");
				}
				break;

			}
		}
		System.out.println("파워스톤을 가질 자격이 충분하다...");

	}

}
