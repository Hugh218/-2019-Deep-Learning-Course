package eX0503;

public class Ex02 {

	public static void main(String[] args) {

		String[] names = { "4", "10", "15", "18", "30" };
		String target = "11";
		for(int i = 0; i<names.length; i++ ) {
			System.out.println(target.compareTo(names[i]));	
		}
		

	}
		//int index = seqSearch(names, target);
//		if (index >= 0) {
//			System.out.println(index + "번재입니다");
//		} else {
//			System.out.println("없습니다");
//		}



//	private static int seqSearch(int[] names, int target) {
//		int S = 0;
//		int E = (names.length - 1);
//
//		while (true) {
//
//			int M = (S + E) / 2;
//
//			System.out.println(S + ", " + E);
//			if (S >= E) {
//				return -1;
//			}
//			if (names[M] - target>0) {
//				E = M - 1;
//			} else if (names[M] < target) {
//				S = M + 1;
//			} else if (names[M] == target) {
//				return M;
//			}
//		}
//	}
//
}
