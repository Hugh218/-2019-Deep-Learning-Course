package Ex0509;

public class Phone_DTO {

	private String name;
	private int age;
	private String tel;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getTel() {
		return tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Phone_DTO(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {

		return "이름 : " + getName() + "\n나이 : " + getAge()+ "\n전화번호 : " + getTel()+"\n";
	}

}
