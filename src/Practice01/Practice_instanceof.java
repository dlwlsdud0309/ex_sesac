package Practice01;

public class Practice_instanceof {
	public static void main(String[] args) {
		//instanceof 앞에 객체를, 뒤에 클래스(타입)을 지정하여 사용
		//boolean 형태의 true와 false로 결과를 나타낸다.
		
		//자식클래스의 객체 instanceof 부모 클래스를 확인할 경우 true 반환

		//=========================================
		//자바의 정석
		
		//참조변수의 형변환 가능여부 확인에 사용하고 가능하면 true를 변환하는 연산자
		//참조변수가 형변환이 가능한지 확인할 때 사용한다.
		
		//오버라이딩과 다형성
		
		
		A ac = new B();
		A ao = new C();
		
		if(ac instanceof B) {
			System.out.println("A");
		}
		
		if(ao instanceof B) {
			System.out.println("B");
		}
		
		if(ac instanceof C) {
			System.out.println("C"); //false
		}
		
		if(ao instanceof C) {
			System.out.println("CC");
		}
		
		if(ac instanceof A) {
			System.out.println("C");
		}
		
	}
}
