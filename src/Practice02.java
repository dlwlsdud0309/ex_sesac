import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		
		//int 타입의 변수 score를 선언하고 키보드로 값을 입력받으세요.
		//score가 90점 이상이면 "A학점입니다.",
		//90점 미만일 경우 "B학점입니다."를 제출하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : "); //줄바꿈없이 입력 위해 print 사용
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A학점입니다.");
		}else if(score<90) {
			System.out.println("B학점입니다.");
		}
	}
}
