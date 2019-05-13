
public class collatz_2 {

	
	public static void main(String[] args) 
	{
		int number = collatzbmber(6);
		System.out.println(number);
		

	}

	
	public static int collatzbmber(int su)
	{
		int count = 0;
		while(true)
		{
			if(su%2==0)
			{
				su/=2;
				count++;
			}
			else if(su%2!=0)
			{
				su = su*3+1;
				count++;
			}
			
			if(su==1)
			{
				break;
			}
			else if(count==500)
			{
				su=-1;
				break;
			}
			
		}
		
		return count;
		
		
		
	}
}
