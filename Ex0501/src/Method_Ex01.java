
public class Method_Ex01 {

	public static int addNumber(int num1, int num2) {
		int result = num1 + num2;

		return result;
	}

	public static void print() {
		System.out.println("���α׷�������Ǿ����ϴ�.");
	}

	public static void addNum(int num1, int num2) {
		int result = num1 + num2;
		
		System.out.println("������ : " + result);
	}

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;

		int result = addNumber(num1, num2);
		System.out.println(result);
		print();
		
		addNum(10,15);
	}

}
