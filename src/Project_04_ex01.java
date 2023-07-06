import java.util.Scanner;

public class Project_04_ex01 {
	public static void main(String[] args) {
		
		//정수를 입력받아 20보다 크거나 같으면 "성인입니다."라고
		//출력하는 프로그램을 만들어보자
		
		//1. 입력 받는 도구(Scanner) 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : "); //print를 사용하면 줄바꿈없이 입력 할 수 있음
		//2. 정수를 입력 받아 age라는 int형 변수에 저장
		int age = sc.nextInt(); //sc을 이용해 입력받은 정수가 age라는 변수에 저장됨
		
		//3. 만약 age가 20보다 크거나 같으면 "성인입니다." 출력
		//4. age가 20보다 작으면 "미성년자입니다." 출력
		if(age >= 20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}
	
	
	}
}
