package ArrayList;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(8);
		list.add(10);
		
		//size() �޼ҵ�� arraylist�� ���̸� �˷��ִ� �޼ҵ� 
		System.out.println("����Ʈ�� size : " + list.size());
		
		
		//add(index, element) >> �߰��� �� ����. 
		list.add(1,77);
		
		//list.remove(2);

		//list.clear();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("����Ʈ�� size : " + list.size());
		
	}

}
