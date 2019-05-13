package java_festival;

public class grade_13 {

	public static void main(String[] args) 
	{
		
		String score ="A,A,B,C,D,A,C,D,D,D,F";
		char a;
		int ACOUNT=0;
		int BCOUNT=0;
		int CCOUNT=0;
		int DCOUNT=0;
		int FCOUNT=0;
		
		for(int i=0; i<=score.length(); i++)
		{
			if(i%2==0)
			{
				a=score.charAt(i);
				if(a=='A')
				{
					ACOUNT++;
				}
				else if(a=='B')
				{
					BCOUNT++;
				}
				else if(a=='C')
				{
					CCOUNT++;
				}
				else if(a=='D')
				{
					DCOUNT++;
				}
				else if(a=='F')
				{
					FCOUNT++;
				}
				
			}
		}
		
		System.out.printf("A : %d\n",ACOUNT);
		System.out.printf("B : %d\n",BCOUNT);
		System.out.printf("C : %d\n",CCOUNT);
		System.out.printf("D : %d\n",DCOUNT);
		System.out.printf("F : %d\n",FCOUNT);
		
	
	}

}
