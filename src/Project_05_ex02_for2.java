import java.util.Iterator;

public class Project_05_ex02_for2 {
	public static void main(String[] args) {
		
		//1. for문을 사용하여 21에서 57까지 출력하시오.
		//2. for문을 사용하여 96에서 53까지 출력하시오.
		//3. for문을 사용하여 21에서 57까지 수 중 홀수만 출력하시오.
		
		for (int i = 21; i <= 57; i++) {
			System.out.println(i);
		}
		
		System.out.println("===============");
		
		for (int i = 96; i >= 53; i--) {
			System.out.println(i);
		}

		System.out.println("===============");
	
		for (int i = 21; i <= 57; i++ ) {
//			if(i%2!=0) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("===============");
		
		for (int i = 21; i <= 57; i=i+2 ) {
			System.out.println(i);
		}
		
	}
}
