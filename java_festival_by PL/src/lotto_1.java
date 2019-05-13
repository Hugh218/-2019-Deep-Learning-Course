package java_festival;

import java.util.Random;
import java.util.Scanner;

public class lotto_1 {

	public static void main(String[] args) 

	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] lotto = new int[6];
		
		
			
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i] = rd.nextInt(6)+1;

				for(int j=0; j<i; j++)
				{
					while(lotto[i]==lotto[j])
					{
						lotto[i]=rd.nextInt(6)+1;
						j=0;
					}
					
				}
			
				System.out.println(lotto[i]);
			
		}
		
		
		

		sc.close();
	}

}
