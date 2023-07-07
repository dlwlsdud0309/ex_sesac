import java.util.Scanner;

public class Practice05_while2 {
	public static void main(String[] args) {
		
		// while문을 사용하여 키보드로부터 입력 받은 수가
		// 10보다 작거나 같을 때만 -> 조건식
		// 계속 정수를 입력받으세요. -> 실행문장
		
		// while(조건식){
		//	실행문장;
		// {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i <= 10) {
			System.out.print("점수 입력 : ");
			i = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
	}
}
