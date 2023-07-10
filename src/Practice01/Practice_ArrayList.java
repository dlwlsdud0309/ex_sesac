package Practice01;

import java.util.ArrayList;

public class Practice_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//ArrayList는 고정된 길이를 가지고 있지 않으므로 length가 아니라 size()함수를 사용.
		//요소는 get()으로 접근한다.
	}
}
