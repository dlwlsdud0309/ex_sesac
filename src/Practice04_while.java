import java.util.Scanner;

public class Practice04_while {
	public static void main(String[] args) {
		
		// while문이란?
		// 주로 반복횟수가 정해지지 않은 경우에 사용
		// 조건식 결과가 true일 동안 실행됨
		
		
		// while문을 사용하여 키보드로부터 입력 받은 수가
		// 10보다 작거나 같을 때만
		// 계속 정수를 입력받으세요.
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		while(score<=10) {
			System.out.print("점수 입력 : ");
			score = sc.nextInt();
		}
		System.out.println("입력이 종료되었습니다.");
		
	}
}
