package GUI;

import java.util.ArrayList;
import java.util.Scanner;

public class LOGIN_CONTROL 
{
	ArrayList<LOGIN_OOP> list = new ArrayList<LOGIN_OOP>();
	Scanner sc = new Scanner(System.in);
	int check=10;
	
	public void Join(String ID,String PW,String Birthday)
	{	LOGIN_OOP lo = new LOGIN_OOP(ID,PW,Birthday);
		list.add(lo);
	}
	
	public int Login(String ID,String PW )
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getId().equals(ID) && list.get(i).getPw().equals(PW))
			{
				
				check=i;
				return check;
				
			}
			
			
		}
		check=-1;
		return check;
		
		
	}
	
	public void changepw(int check,String chang_pw)
	{
		list.get(check).setPw(chang_pw);
	}
	
	public void printmyprofill(int check)
	{
		System.out.println("ID :"+list.get(check).getId());
		System.out.println("PW :"+list.get(check).getPw());
		System.out.println("Birthday :"+list.get(check).getBirthday());
	}
	
	public int logout()
	{
		check = -1;
		return check;
	}

}
