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
	}
}
