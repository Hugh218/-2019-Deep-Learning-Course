import java.util.Arrays;

public class P24 {
	
	
	
	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));

	}
	
	public static char[] reverseStr(String a) {
		char ch[] = new char[a.length()];
		for (int i =0; i<= a.length(); i++) {
			ch[i] = a.charAt(i);	
		}
	
		return ch;
	
	}

}
