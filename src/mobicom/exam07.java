package mobicom;

public class exam07 {

	public static void main(String[] args) {
		Car myCar1 = new Car("빨강", 0);

		Car myCar2 = new Car("파랑", 0);
		
		Car myCar3 = new Car("초록", 0);
		
		myCar1.upSpeed(50);
		System.out.println("자동차1의 색상은 " + myCar1.getColor()
				+ "이며, 속도는 "
				+ myCar1.getSpeed() + "km입니다.");
		
		myCar2.downSpeed(20);
		System.out.println("자동차2의 색상은 " + myCar2.getColor()
				+ "이며, 속도는 "
				+ myCar2.getSpeed() + "km입니다.");
		
		myCar3.upSpeed(250);
		System.out.println("자동차3의 색상은 " + myCar3.getColor()
				+ "이며, 속도는 "
				+ myCar3.getSpeed() + "km입니다.");
	
	}

}
