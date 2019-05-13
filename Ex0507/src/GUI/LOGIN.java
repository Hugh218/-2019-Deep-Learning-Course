package GUI;

import java.util.Scanner;

public class LOGIN {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LOGIN_CONTROL lc = new LOGIN_CONTROL();
		int num =0;
		int check;
		while(true)
		{
			System.out.println("=============MemberSystem=============");
			System.out.print("[1]JOIN [2]LOGIN >>");
			num = sc.nextInt();
			
			if(num==1)
			{
				sc.reset();
				String ID_1;
				String PW_1;
				String Birthday;
				LOGIN_OOP lo = new LOGIN_OOP();
				System.out.print("ID : ");
				ID_1 = sc.next();
				System.out.print("PW : ");
				PW_1 = sc.next();
				System.out.print("Birthday : ");
				Birthday=sc.next();
				lc.Join(ID_1,PW_1,Birthday);
				
			}
			else if(num==2)
			{
				
				sc.reset();
				System.out.print("ID : ");
				String ID = sc.next();	
				System.out.print("PW : ");
				String PW = sc.next();
				check=lc.Login(ID, PW);
				
				if(check==-1)
				{
					System.out.println("LOG IN FAIL");
				}
				else if(check>=0)
				{
					System.out.println("Hello "+lc.list.get(check).getId());
					while(true)
					{
						System.out.println("=============MemberSystem=============");
						System.out.println("[1]MY_PROFILE [2]CHANGE_PW [3]LOG_OUT >>");
						num = sc.nextInt();
						if(num==1)
						{
							lc.printmyprofill(check);
						}
						else if(num==2)
						{
							String pw;
							System.out.println("변경할 비밀번호를 입력하세요 : ");
							pw = sc.next();
							lc.changepw(check,pw);
							System.out.println("변경되었습니다.");
						}
						else if(num==3)
						{
							check=lc.logout();
						}
						
						if(check==-1)
						{
							break;
						}
					}
				}
				
			}
		}
		
		

	}

}
