import java.util.Scanner;

public class Prectice01 {
	public static void main(String[] args) {
		
		//정수를 입력받아 20보다 크거나 같으면 "성인입니다."
		//라고 출력하는 프로그램을 만들어보세요.
		
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다.");
		}
		
	}
}
