package ex15usefulclass;
/*
equals() 메서드
- 자바에서 인스턴스의 내용비교를 위해 비교연산자(==)를 사용하는 것은
	단순히 참조 값에 대한 비교이므로, 실제 내용에 대한 비교는
	이루어지지 않는다.
- 인스턴스간의 내용비교를 위해서는 equals()메서드를 각 클래스에
	맞게 오버라이딩하여 사용해야 한다.
- String과 같은 기본클래스는 별도의 오버라이딩 없이도 내용비교가
	가능하다.
 */
class IntNumber {
	
	int num;
	
	public IntNumber(int num) {
		this.num = num;
	}
	
	/*
	equals()메서드가 어떻게 인스턴스간의 내용을 비교하는지
	설명하기 위한 코드
	 */
	public boolean myEquals(IntNumber numObj) {
		if (this.num == numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class E04Object2MyEquals {
	
	public static void main(String[] args) {
		
		// String과 같은 기본클래스는 별도의 오버라이딩없이 내용비교 가능
		String str1 = new String("우린KOSMO");
		String str2 = "우린KOSMO";
		
		if (str1.equals(str2)) {
			System.out.println("같은 문자열");
		}
		else {
			System.out.println("다른 문자열");
		}
		
		// 개발자가 정의한 클래스에 대한 비교
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if (num1.myEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if (num1.myEquals(num3)) {
			System.out.println("num1과 num3는 동일한 정수");
		}
		else {
			System.out.println("num1과 num3는 다른 정수");
		}
	}
	
}
