package Picture;

import java.util.ArrayList;

public class GraphicTool {
	ArrayList<Shape> list = null;
	
	public GraphicTool() {
		list = new ArrayList<Shape>();	
	}
	
	public void addShape(Shape sh) {
		list.add(sh);
		
	}
	
	public void allDraw() {
		for(int i =0; i<list.size(); i++ ) {
			list.get(i).output();
		}
	}
	
	
	
}
