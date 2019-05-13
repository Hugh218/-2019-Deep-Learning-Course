package T02;

public class ContactVO {
	private String id;
	private String pw;
	private String birth;

	public ContactVO(String id, String pw, String birth) {
		this.id = id;
		this.pw = pw;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getBirth() {
		return birth;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String toString() {
		return id + ", " + pw + ", " + birth;
	}

}
