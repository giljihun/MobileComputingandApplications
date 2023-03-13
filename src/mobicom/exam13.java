package mobicom;

//interface clickListener {
//	public void print();
//}
//
//public class exam13 {
//
//	public static void main(String[] args) {
//		
//		clickListener listener = 
//				(new clickListener() {
//					public void print() {
//						System.out.println("클릭 리스너입니다. ");
//					}
//				});
//
//		listener.print();
//		
//	}
//
//}

interface clickListener {
	public void print();
}

public class exam13 {

	public static void main(String args[]) {

		clickListener listener1 = new MyClickListener();
		listener1.print();
		
		
		clickListener listener2 = (new clickListener() {
				public void print() {
					System.out.println("anonymous inner class 클릭 리스너입니다.");
				}
			});

		listener2.print();
		
		
		System.out.println("listener1 class = " + listener1.getClass().getName());
		
		System.out.println("listener2 class = " + listener2.getClass().getName());
		
	}

}

class MyClickListener implements clickListener{


	public void print() {
	
		System.out.println("MyClickLister 클래스에서 print()구현");
	}
}
