
public class P13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		char a;
		int Acount = 0;
		int Bcount = 0;
		int Ccount = 0;
		int Dcount = 0;
		int Fcount = 0;

		for (int i = 0; i < score.length(); i++) {
			a = score.charAt(i);
			switch (a) {
			case 'A':
				Acount++;
				break;
			case 'B':
				Bcount++;
				break;
				
			case 'C':
				Ccount++;
				break;

			case 'D':
				Dcount++;
				break;

			case 'F':
				Fcount++;
				break;

			}

		}
		System.out.println("A : "+Acount+"명");
		System.out.println("B : "+Bcount+"명");
		System.out.println("C : "+Ccount+"명");
		System.out.println("D : "+Dcount+"명");
		System.out.println("F : "+Fcount+"명");
		

	}
}
