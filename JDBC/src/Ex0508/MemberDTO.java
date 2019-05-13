package Ex0508;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	
	
	
	
	public MemberDTO(String id, String pw, String name, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	
	
	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
	
		return "ID :" +getId()+"\nPW : "+getPw()+"\n Name :"+getName()+"\n TEL : "+getTel();
	}
}
