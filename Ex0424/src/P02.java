import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int sec = sc.nextInt();
		
		int res_hour = sec/3600;
		int res_min = (sec-res_hour*3600)/60;
		int res_sec = sec%60;
		
		System.out.println(res_hour+"��"+res_min+"��"+res_sec+"��");
	}

}
