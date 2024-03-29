package ex05method;
/*
메서드 오버로딩(Method Overloading)
	: 동일한 이름의 메서드를 두 개 이상 정의하는 것을 말한다.
	- 매개변수의 갯수가 다르거나 자료형이 다를 때 성립한다.
	- 반환 타입만 다른 것은 허용하지 않는다.
	- 컴파일러는 메서드 호출시 전달되는 파라미터(인자)를 통해
	호출할 메서드를 구분한다.
 */
public class E07Overloading {

	public static void main(String[] args) {
		
		// 매개변수가 2개인 메서드 호출
		person(123456, 7890123);
		System.out.println("======================");
		// 매개변수가 1개인 메서드 호출
		person(987654);
		
	}
	
	public static void person(int juminNum, int milNum) {
		
		System.out.println("군필자");
		System.out.println("주민 번호 : " + juminNum);
		System.out.println("군번 : " + milNum);
	}
	
	public static void person(int juminNum) {
		
		System.out.println("미필자이거나 여성");
		System.out.println("주민 번호 : " + juminNum);
	}
	
//	public static int person(int juminNum) {
//		
//		System.out.println("미필자이거나 여성");
//		System.out.println("주민 번호 : " + juminNum);
//		
//		return 1;
//	}

}
