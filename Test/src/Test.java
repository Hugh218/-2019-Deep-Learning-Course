import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        // �̵ �ﰢ��
        System.out.println("�ݷ��� : ����Ƽ������ ������ؼ���... ���� ���� ���� ��ŭ ���� �ﰢ���� ������ �Ѵ�.. ");
        System.out.println("�ݷ��� : ���� ���ڸ� ���� ��(1 ~ 10) �� ���ڸ�ŭ �� �ﰢ���� ����ٸ�...");
        System.out.println("�ݷ��� : ����Ƽ������ ������ �� ���� ���̴�...");
        System.out.println("�ݷ��� : �ݺ����� �� �� ����Ѵٸ� ���ѷ����� �������� �𸥴ٱ�!");
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int line = rand.nextInt(10)+1;
        System.out.println("�ݷ��Ͱ� ���� ���� >> "+ line);
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
        System.out.println("¦¦¦! �Ϻ��ϱ�");
        
	}

}
