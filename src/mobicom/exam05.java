package mobicom;

public class exam05 {
	
	static int var = 100;
	
	public static void main(String[] args) {
		int var = 0;
		System.out.println(var);
		
		int sum = addFunction(10, 20);
		System.out.println(sum);

	}
	
	//static을 붙이지 않으면 addFunction을 가지고 있는 exam05를 인스턴스화 시켜야 한다.
	static int addFunction(int num1, int num2) {
		int hap;
		hap = num1 + num2 + var;
		return hap;
	}

}
