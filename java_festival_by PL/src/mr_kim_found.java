package java_festival;

public class mr_kim_found {

	
	
	public static void main(String[] args) 
	{
		String[] names = {"Queen","Tod","Kim"};
		System.out.println(findkim(names));

	}
	
	public static String findkim(String[] names)
	{
		int find=0;
		String find1 = "Kim";
		for(int i=0; i<names.length; i++)
		{
			if(names[i].equals(find1))
			{
				find=i+1;
			}
		}
		
		return "김서방은"+find+"에 있다.";
		
	}

}
