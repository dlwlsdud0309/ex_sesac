import java.util.Scanner;

public class Project_03_ex02 {

	public static void main(String[] args) {
		
		//1. Scanner 도구 불러오기
		Scanner scan = new Scanner(System.in);
		
		//2. 입력명령어 사용하여 실제로 입력받아보기
//		int num = scan.nextInt();
//	
//		System.out.println(num);
		
		//문자열 출력하기
		String name = scan.next();
		System.out.println("제 이름은 "+name+" 입니다.");
		
	}

}
