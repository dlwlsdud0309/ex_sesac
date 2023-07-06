
public class Project_03_ex01 {
	public static void main(String[] args) {
		
		//1. 출력하기
		System.out.println("안녕하세요");
		
		//2. 변수명 지정하여 변수가 지정한 값 출력하기
		String name = "이진영";
		System.out.println(name); //큰따옴표가 없으면 변수로 인식함
	
//		System.out.println(name "입니다."); //에러, 연결 위해 +연산자 필요
		System.out.println(name+"입니다.");

		System.out.print(name+"입니다."); //println(자동줄바꿈)과 print(줄바꿈없음)
		
		System.out.println("=====");
		
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕");
		System.out.print("하세요");
	}
}
