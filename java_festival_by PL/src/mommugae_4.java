package java_festival;

import java.util.Scanner;

public class mommugae_4 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("��������� : ");
		num1 = sc.nextInt();
		System.out.print("��ǥ������ : ");
		num2 = sc.nextInt();
		int i = 1;
		while(true)
		{
			System.out.printf("%d���� ���� ������ : ",i);
			num1-=sc.nextInt();
			i++;
			if(num1<=num2)
			{
				System.out.printf("%dkg �޼�!! �����մϴ�!",num1);
				break;
			}
		}
		
		sc.close();
		

	}

}
