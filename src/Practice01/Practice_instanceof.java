package Practice01;

public class Practice_instanceof {
	public static void main(String[] args) {
		A ac = new B();
		A ao = new C();
		
		if(ac instanceof B) {
			System.out.println("A");
		}
		
		if(ao instanceof B) {
			System.out.println("B");
		}
		
		if(ac instanceof C) {
			System.out.println("C");
		}
		
		if(ao instanceof C) {
			System.out.println("CC");
		}
	}
}
