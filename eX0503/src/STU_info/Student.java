package STU_info;

public class Student {
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;

	// 생성자
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
		System.out.println(name + "님 안녕하세요");
		System.out.println("학번 : " + number + ", 나이 : " + age);
		System.out.println(name + "님의 Java 점수는 : " + scoreJava);
		System.out.println(name + "님의 Web 점수는 : " + scoreWeb);
		System.out.println(name + "님의 Android 점수는 : " + scoreAndroid + "\n");

	}
	
	public Student() {
		
		
	}

	
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		//super();//상속 이어서 설명. super-sub의 개념 
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

}
