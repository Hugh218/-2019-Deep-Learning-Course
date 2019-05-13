package ArrayList;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(8);
		list.add(10);
		
		//size() 메소드는 arraylist의 길이를 알려주는 메소드 
		System.out.println("리스트의 size : " + list.size());
		
		
		//add(index, element) >> 중간에 값 삽입. 
		list.add(1,77);
		
		//list.remove(2);

		//list.clear();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("리스트의 size : " + list.size());
		
	}

}
