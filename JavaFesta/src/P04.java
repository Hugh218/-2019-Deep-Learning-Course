import java.util.Scanner;

// ������ ����
public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� :");
		int cur = sc.nextInt();
		System.out.print("��ǥ������ :");
		int goal = sc.nextInt();
		int cnt=0;
		
		while(true) {
			cnt++;
			System.out.print(cnt+"���� ���� ������ : ");
			cur -= sc.nextInt();
			if(cur <=goal ) {
				System.out.println(cur+"kg �޼�!! �����մϴ�!");
				break;
			}
		}
		sc.close();
		
	}

}
