import java.util.Scanner;

public class P12_1 {

	public static void main(String[] args) {
		System.err.println("�ִ����� &�ּҰ���� ���ϱ�");
		Scanner sc = new Scanner(System.in);
		System.out.println("����1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.println("����2 �Է� >> ");
		int num2 = sc.nextInt();

		int LCM;
		int NMG = 1;
		//������ num2�� �������� ����� 
		int temp1 = num1, temp2=num2;
		if(num1<num2) {
			num1 = temp2;
			num2 = temp1;
		}
		//NMG�� 0���� ũ�⸸�ϸ� �ݺ��Ѵ�. >> �������� 0���� ������������ �ݺ��Ѵ�.
		// �������� �������� ��� ������. 
		// num1�� �ִ������� ����¹��.
		while(NMG>0) {
			NMG = num1%num2;
			num1=num2;
			num2=NMG;
		} 
		LCM = temp1 * temp2/num1;
		System.out.println("�ִ� ����� : " + num1);
		System.out.println("�ּ� ����� : " + LCM);
	}

}
