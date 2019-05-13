package GUI;

public class LOGIN_OOP 
{
	private String id;
	private String pw;
	private String birthday;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public LOGIN_OOP(String id, String pw, String birthday) 
	{
		this.id = id;
		this.pw = pw;
		this.birthday = birthday;
	}
	
	LOGIN_OOP()

	{
		
	}
	
	

}
