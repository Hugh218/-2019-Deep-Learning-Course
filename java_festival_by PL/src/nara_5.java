package java_festival;

public class nara_5 {

	public static void main(String[] args) 
	{
		System.out.println(change124(5));
		
	}
	
	public static String change124(int number)
	{
		
		String answer = "";
		int reminder;

		while(number > 0){
			reminder = number % 3;
			number = number / 3;
			if (reminder == 0)
			{
				number -= 1;
				reminder = 4;
			}
			answer = reminder + answer;
		}

		return answer;
		
	
		 
	}

}
