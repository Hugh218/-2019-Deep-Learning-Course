import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        // 이등변 삼각형
        System.out.println("콜렉터 : 리얼리티스톤을 얻기위해서는... 내가 뽑은 숫자 만큼 행의 삼각형을 만들어야 한다.. ");
        System.out.println("콜렉터 : 랜덤 숫자를 뽑은 후(1 ~ 10) 그 숫자만큼 별 삼각형을 만든다면...");
        System.out.println("콜렉터 : 리얼리티스톤을 차지할 수 있을 것이다...");
        System.out.println("콜렉터 : 반복문을 잘 못 사용한다면 무한루프에 빠질지도 모른다굿!");
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int line = rand.nextInt(10)+1;
        System.out.println("콜렉터가 뽑은 숫자 >> "+ line);
        int i,j,k;
        
        for(i=1; i<=line; i++) {
        	for(k=i; k<line; k++) {
        		System.out.print(" ");
        	}
        	for(j=0; j<2*i-1; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println("짝짝짝! 완벽하군");
        
	}

}
