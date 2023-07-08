
public class Practice06_NO2 {
	public static void main(String[] args) {
		
		// 변수명 규칙
		
		// 1. 키워드 사용 불가
		//		static, new, continue, switch 등등 자바에서 이미 지정한 키워드는 사용이 불가하다.
		
		// 2. 대소문자가 구분되며, 길이에 제한이 없다.
		// 		int True; 와 int true;는 서로 다르다.
			int _True = 2;
			int _true = 3;
			
			System.out.println(_True);
			System.out.println(_true);
			
			
		// 3. 숫자로 시작할 수 없다.
			//int 1a = 1; //사용불가
			int a1 = 2;
		
		// 4. 특수문자는 _와 $만 사용가능하다.
			String _var = "var1";
			String $var = "var2";
			//String #var = "var3"; //사용불가
	
			
	}
}
