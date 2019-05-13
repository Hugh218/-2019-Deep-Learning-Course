package OOP;

public class Tv {

	String com_name;
	int size;
	int light;
	int channel=0;
	int vol;
	boolean power;

	public void powerOn() {

		System.out.println("Tv ON!");

	}

	public void powerOff() {

		System.out.println("Tv OFF!");

	}
	
	public int chaneelUp() {
		
		return ++channel;
	}
	
	public int chaneelDown() {
		
		return --channel;
	}
}
