import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//µÎ ¼ö¸¦ ÀÔ·Â ¹Þ¾Æ ´õÇÑ °á°ú¸¦ Ãâ·Â
		//»¬¼À°á°ú, °ö¼À°á°ú, ³ª´°¼À °á°ú¸¦ Ãß°¡
		int num1, num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("1¹øÂ° ¼ýÀÚ ÀÔ·Â >> ");
		num1 = sc.nextInt();
		System.out.println("2¹øÂ° ¼ýÀÚ ÀÔ·Â >> ");
		num2 = sc.nextInt();
		
		int res_add = num1 + num2 ;
		int res_sub = num1 - num2;
		int res_mul = num1 * num2;
		float res_div = (float)num1/num2;
		
		System.out.println("µ¡¼À °á°ú >> " + res_add);
		System.out.println("»¬¼À °á°ú >> " + res_sub);
		System.out.println("³ª´°¼À °á°ú >> " + res_mul);
		System.out.println("°ö¼À °á°ú >> " + res_div);
		
	}

}
