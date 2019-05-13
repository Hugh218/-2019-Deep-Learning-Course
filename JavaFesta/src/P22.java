import java.util.Scanner;

public class P22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("N ют╥б : ");
		int n = sc.nextInt();
		int count = 1;
		int j = 1;
		
		for(int i=0; i<n; i++ ) {
			System.out.print(j+ " ");
			j += count; 
			count++;
		}
		

	}

}
