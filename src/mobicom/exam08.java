package mobicom;

public class exam08 {

	public static void main(String[] args) {
		
		Car myCar1 = new Car("빨강", 0);
		Car myCar2 = new Car("파랑", 0);
		Car myCar3 = new Car("초록", 0);

		
		// 노란줄이 쳐져있는 이유 = 이런식으로 부르지마라! 왜냐면 너는 스태틱을 썼잖아!!!
		System.out.println("생산된 차의 대수(정적 필드) ==> " + myCar1.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) ==> " + myCar1.currentCarCount());
		System.out.println("차의 최고 제한 속도 ==> " + Car.MAXSPEED);
		
		
		// Math 클래스의 메서드들이 스태틱으로 선언되어있으니까 바로 사용이 가능한 것!
		// 인스턴스로 Math를 만들필요가 없다는 것.
		System.out.println("PI의 값 ==> " + Math.PI);
		System.out.println("3의 5제곱 ==> " + Math.pow(3,  5));
	}

}
