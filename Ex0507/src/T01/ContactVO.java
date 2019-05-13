package T01;

public class ContactVO {
	private String name;
	private int age;
	private String number;
	
	public ContactVO(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getNumber() {
		return number;
	}
	
	
	public String toString() {
		//stringbuilder°¡ ÀÖÀ½
		return name + ", " + age + ", " + number;
	}
	
	
	
}
