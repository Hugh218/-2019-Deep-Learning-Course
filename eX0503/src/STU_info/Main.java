package STU_info;

public class Main {

	public static void main(String[] args) {
		Student stu1 = new Student("�ڿ�ȣ", "20180000", 22, 100, 75, 75);
//		stu1.name = "�ڿ�ȣ";
//		stu1.number = "20180000";
//		stu1.age = 22;
//		stu1.scoreJava = 100;
//		stu1.scoreWeb = 80;
//		stu1.scoreAndroid = 77;

		Student stu2 = new Student("�̸�ȣ","0",22,100,100,100);
//		stu2.name = "�̸�ȣ";
//		stu2.number = "20180001";
//		stu2.age = 22;
//		stu2.scoreJava = 100;
//		stu2.scoreWeb = 100;
//		stu2.scoreAndroid = 100;

		stu1.show();
		stu2.show();

		
		Student stu3 = new Student();
		stu3.age = 22;
		
		Student stu4 = new Student("�̱Ժ�");
		stu4.show();
		
		
	}

}
