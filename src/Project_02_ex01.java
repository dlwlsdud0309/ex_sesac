
public class Project_02_ex01 {
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 2;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		//더하기 연산자의 경우 문자와의 연산도 가능
		System.out.println("num1의 값은 "+num1); //num1은 숫자가 아니라 문자
		
		//연산 순서에 따라 결과는 문자처리됨
		System.out.println("num1과 num2의 값은 "+num1+num2);
		
		//num1과 num2를 숫자로 연산하기 위해서는 괄호처리를 해주어야함
		System.out.println("num1과 num2의 값은 "+(num1+num2));
	}
}
