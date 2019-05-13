package OOP;
import java.util.Scanner;;
public class Tv_main {

	public static void main(String[] args) {
		
		Tv samsungTV = new Tv();
		samsungTV.powerOn();
		int channel = samsungTV.chaneelUp();
		System.out.println(channel);
		
		Tv lgtv = new Tv();
		lgtv.powerOff();
		int channel2 = lgtv.chaneelUp();
		System.out.println(channel2);
		
		
	}

}
