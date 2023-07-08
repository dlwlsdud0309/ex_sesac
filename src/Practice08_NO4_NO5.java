import java.util.Scanner;

public class Practice08_NO4_NO5 {
	public static void main(String[] args) {
//		System.out.print("이름을 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		System.out.println("제 이름은 "+name+"입니다.");
		
		
//		System.out.print("나이 입력 >> ");
//		int age = sc.nextInt();
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("미성년자입니다.");
//		}
//		System.out.println("프로그램이 종료됩니다.");
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점입니다.");
		}else if(score >= 80) {
			System.out.println("B학점입니다.");
		}else if(score >= 70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
