package ex07string;
/*
StringBuffer 클래스
	: String 클래스는 기존 문자열에 새로운 문자열을 추가하면
	새롭게 생성된 메모리에 문자열을 저장한다. 기존 메모리가 소멸되고
	새로운 메모리가 생성되는 낭비를 막기위해 문자열의 변경이 많은
	경우라면 StringBuffer 클래스를 주로 사용한다. 해당 클래스는 기존
	메모리의 문자열을 변경하는 방식으로 문자열을 추가한다.
 */
public class E03StringBuilderBuffer {
	
	public static void main(String[] args) {
		
		/*
		append() : 문자열의 끝에 새로운 문자열을 연결한다.
		insert() : 지정한 인덱스 위치에 문자열을 삽입한다.
		 */
		StringBuffer strBuf = new StringBuffer("AB"); // 객체생성
		strBuf.append(25); // 정수 연결
		strBuf.append("Y").append(true); // boolean 연결
		System.out.println("strBuf = " + strBuf);
		
		strBuf.insert(2, false); // boolean 삽입
		strBuf.insert(strBuf.length(), 'Z'); // char 삽입
		System.out.println("strBuf = " + strBuf);
		
		System.out.println("String과 StringBuffer의 참조 값 비교");
		String str1 = "코스모";
		String str2 = "코스모";
		if (str1 == str2) {
			System.out.println("연결전: 주소 값 동일"); // 출력
		}
		else {
			System.out.println("연결전: 주소 값 다름");
		}
		
		// String은 문자열을 연결하면 새로운 메모리를 생성한다
		str1 += " 영원하라";
		if (str1 == str2) {
			System.out.println("연결후: 주소 값 동일");
		}
		else {
			System.out.println("연결후: 주소 값 다름"); // 출력
		}
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf = " + buf);
		System.out.println("저장된 문자열 크기: " + buf.length());
		System.out.println("기본 버퍼 크기: " + buf.capacity());
		
		buf.append("금일은 StringBuffer공부 중임").
			append(" 오늘은 화요일");
		System.out.println("buf = " + buf);
		System.out.println("저장된 문자열 크기: " + buf.length());
		System.out.println("기본 버퍼 크기: " + buf.capacity());
		
	}
	
}
