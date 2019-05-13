

import java.util.Scanner;

public class jungsuN_22 {

	public static void main(String[] args) 
	{
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("N ют╥б : ");
		number=sc.nextInt();
		int count=1;
		int j=1;
		
		for(int i=0; i<number; i++)
		{
			System.out.print(j+" ");
			j+=count;
			count++;
		}
		
		sc.close();
	}

}
