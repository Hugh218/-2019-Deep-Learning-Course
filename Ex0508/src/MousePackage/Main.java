package MousePackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mouse m = new Mouse();
		m.Click();
		m.rClick();
		m.Drag();
		
		WheelMouse wm =new WheelMouse();
		wm.Click();
		wm.rClick();
		wm.Drag();
		wm.scroll();
		
		GamingMouse gm = new GamingMouse();
		gm.Click();
		gm.Drag();
		gm.rClick();
		gm.wclick();
		
		//upCasting, downCasting
		Mouse m2 = new WheelMouse();
		Mouse m3 = new GamingMouse(); //upCasting 
		
		((WheelMouse)m2).scroll(); //downCasting
		((GamingMouse)m3).wclick();
		
	}

}
