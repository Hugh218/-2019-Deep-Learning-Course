package STU_info;

public class Student {
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;

	// ������
//	public Student(String n, String num, int a, int sJ, int sW, int sA) {
//
//		name = n;
//		number = num;
//		age = a;
//		scoreJava =sJ;
//		scoreWeb = sW;
//		scoreAndroid = sA;
//	}
	

	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���");
		System.out.println("�й� : " + number + ", ���� : " + age);
		System.out.println(name + "���� Java ������ : " + scoreJava);
		System.out.println(name + "���� Web ������ : " + scoreWeb);
		System.out.println(name + "���� Android ������ : " + scoreAndroid + "\n");

	}
	
	public Student() {
		
		
	}

	
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		//super();//��� �̾ ����. super-sub�� ���� 
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

}
