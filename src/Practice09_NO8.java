import java.util.ArrayList;
import java.util.Scanner;

public class Practice09_NO8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int i = 0;
//		while(i <= 10) {
//			System.out.print("점수 입력 : ");
//			i = sc.nextInt();
//		}
//		System.out.println("종료되었습니다.");

		int score = 0;
		while(score <= 100) {
			System.out.println("점수 입력 : ");
			score = sc.nextInt();
			if(score >= 90) {
				System.out.println("A학점입니다.");
//				continue;
			}else if(score >= 80) {
				System.out.println("B학점입니다.");
			}else if(score >= 70) {
				System.out.println("C학점입니다.");
			}else {
				System.out.println("F학점입니다. 재수강이 필요합니다.");
			}
		}
		System.out.println("종료되었습니다.");

	}
	
}
