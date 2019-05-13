
//package 파트너시험;

import java.util.Random;
import java.util.Scanner;

public class InfinityStone {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("인피니티 스톤을 찾아 나서자");

		while (true) {

			System.out.println("[1]스페이스스톤 [2]파워스톤 [3]마인드스톤 [4]타임스톤 [5]리얼리티스톤  [6]종료");

			int choice = new Scanner(System.in).nextInt();

			if (choice == 1) {
				// 가장 마지막 Index부터 출력
				System.out.println("로키 : 스페이스스톤을 얻기위해서는... 배열의 공간을 활용할 줄 알아야한다... ");
				System.out.println("로키 : int[] array : {1,2,3,4,5} 배열을 생성 후에... 끝에서 부터 출력하면");
				System.out.println("로키 : 스페이스 스톤을 차지할 수 있을 것이다...");

				int[] array = { 1, 2, 3, 4, 5 };

				System.out.print("결과 ->");
				System.out.println("int [] array = {" + array[4] + "," + array[3] + "," + array[2] + "," + array[1]
						+ "," + array[0] + "}");

			} else if (choice == 2) {
				// 가위바위보 배열 랜덤 넣고
				System.out.println("로난 : 파워스톤을 얻기위해서는... 컴퓨터와의 정면승부에서 이겨야 한다... ");
				System.out.println("로난 : 컴퓨터와의 가위바위보를 하여 이겨라");
				System.out.println("로난 : 3번 먼저 승리한다면 파워 스톤을 차지할 수 있을 것이다...");

				int cntCom = 0;
				int cntUser = 0;
				Random rd = new Random();
				String[] rsp = { "가위", "바위", "보" };
				int dap_count = 0;
				int com_count = 0;
				while (true) {
					System.out.print("가위,바위,보 중 하나를 입력해라 : ");
					String dap = sc.next();

					char dp = dap.charAt(0);
					String com = rsp[rd.nextInt(3)];
					char co = com.charAt(0);

					if (dp == co) {
						System.out.println("무승부!");
					} else if ((dp == '가' && co == '바') || (dp == '바' && co == '보') || (dp == '보' && co == '가')) {
						com_count++;
						System.out.printf("나의 %d승!\n",com_count);
						

					} else if ((co == '가' && dp == '바') || (co == '바' && dp == '보') || (co == '보' && dp == '가')) {
						dap_count++;
						System.out.printf("너의 %d승!\n",dap_count);
						
					}

					if (dap_count == 3) {
						System.out.println("파워스톤을 가질 자격이 충분하다");
						break;
					} else if (com_count == 3) {
						System.out.println("다시 도전해라");
						break;
					}
				}

			} else if (choice == 3) {
				// 업다운 게임
				System.out.println("치타우리 셉터 : 마인드스톤을 얻기위해서는... 컴퓨터가 낸 숫자를 알아야한다... ");
				System.out.println("치타우리 셉터 : 컴퓨터가 낸 숫자를 추측하여 컴퓨터의 숫자를 맞추어라");
				System.out.println("치타우리 셉터 : 5회안에 숫자를 맞춘다면 마인드스톤을 얻을 수 있으리...\n");
				int number = rand.nextInt(99) + 1;
				int input = 0;

				
				for (int life = 5; life > 0; life--) {
					System.out.print("숫자를 입력해라.. 크큭(1~99) : ");
					input = sc.nextInt();
					if (life == 1) {
						System.out.println("마인드 스톤을 차지하지 못했다.");
						break;

					}

					if (input < number) {
						System.out.println("up");
						System.out.println("목숨이" + (life - 1) + "개 남았다.");
					} else if (input > number) {
						System.out.println("down");
						System.out.println("목숨이" + (life - 1) + "개 남았다.");
					} else {
						System.out.println("success!");
						break;
					}
				}

			} else if (choice == 4) {
				// 시분초 계산
				// 초단위 시간 입력시 변경완료
				System.out.println("에인션트 원 : 타임스톤을 얻기위해서는... 시간을 활용할 줄 알아야한다... ");
				System.out.println("에인션트 원 : 초단위를 입력받은후 초를 시간과 분과 초로 바꿀줄 안다면");
				System.out.println("에인션트 원 : 타임스톤을 차지할 수 있을 것이다...");

				System.out.print("초를 입력해라 >>");
				int time = sc.nextInt();

				int hour = (time / 60) / 60;
				int minute = (time / 60) % 60;
				int second = time % 60;
				System.out.println(hour + "시" + minute + "분" + second + "초");

				System.out.println("시간을 가질 자격이 충분하다... 어서 도르마무 다크디멘션으로 부터 우릴 지켜줘...");

			} else if (choice == 5) {
				// 이등변 삼각형
				System.out.println("콜렉터 : 리얼리티스톤을 얻기위해서는... 내가 뽑은 숫자 만큼 행의 삼각형을 만들어야 한다.. ");
				System.out.println("콜렉터 : 랜덤 숫자를 뽑은 후(1 ~ 10) 그 숫자만큼 별 삼각형을 만든다면...");
				System.out.println("콜렉터 : 리얼리티스톤을 차지할 수 있을 것이다...");
				System.out.println("콜렉터 : 반복문을 잘 못 사용한다면 무한루프에 빠질지도 모른다굿!");

				int line = rand.nextInt(10) + 1;
				System.out.println("콜렉터가 뽑은 숫자 >> " + line);
				int i, j, k;

				for (i = 1; i <= line; i++) {
					for (k = i; k < line; k++) {
						System.out.print(" ");
					}
					for (j = 0; j < 2 * i - 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				System.out.println("짝짝짝! 완벽하군");

			} else if (choice == 6) {
				System.out.println("모든 스톤 모으기는 끝이 났다...");
				break;
			} else {
				System.out.println("엔트맨 : 정확한 숫자를 입력하지 않는다면 양자영역에 갇힐지도 몰라...!");

			}

		}

	}

}