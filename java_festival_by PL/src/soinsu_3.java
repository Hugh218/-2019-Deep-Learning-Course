package java_festival;
import java.util.Scanner;

public class soinsu_3 {

	public static void main(String[] args) 
	{
		
		int num = 0;
		int i=2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		num = sc.nextInt();
		
		System.out.printf("%d = ",num);
		while(true)
		{
			if(num%i==0)
			{
				num=num/i;
				System.out.print(i);
				if(num>2)
				{
					System.out.print("*");
				}
				
				
			}
			else
			{
				i++;
			}
			if(num==1)
			{
				break;
			}
			
			
		}
		
		sc.close();
		

	}

}
