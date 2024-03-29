package ex12inheritance;

// 자식 클래스
public class DeChild extends DeParent {
	
	String stNumber; // 학번을 표현
	
	public DeChild(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	
	// 자식 클래스에서 확장한 메서드
	public void study() {
		System.out.println(getName() + "이(가) 공부한다");
	}
	
	/*
	오버라이딩 아님
		: 부모 클래스에서 private멤버로 선언하였기 때문에
		자식쪽에서는 보이지 않아 오버라이딩의 대상이 될 수 없다.
		해당 함수는 자식쪽에서 새롭게 확장한 메서드가 된다.
	 */
	private void eat() {
		System.out.println("학생이 먹는다");
	}
	
	/*
	메서드 오버라이딩의 조건
	- 부모 클래스에서 선언될 때와 비교해서 접근범위가 동일하거나
	그보다 넓으면 가능하다.
	- 부모에서 default로 선언하면 자식에서는 default혹은
	그보다 넓으면 오버라이딩이 가능하다.
	 */
	@Override
	public String sleep() {
		System.out.println("학생이 잔다");
		return null;
	}
	
	/*
	메서드의 형태가 부모쪽과 다르므로 오버라이딩이 아님
	다른 메서드이므로 오버로딩되어 확장한 메서드가 된다.
	 */
	public int walk(int age) {
		System.out.println("나이가 " + age + "살인 학생이 산책한다");
		return 0;
	}
	
	@Override
	public void excecise() {
		System.out.println("학생이 운동한다");
	}
	
	@Override
	public void printParent() {
		/*
		super의 두 가지 사용법
		- super() : 부모 클래스의 생성자 호출
		- super.멤버 : 부모 클래스의 멤버 메서드 혹은
			변수를 접근할때 사용
		 */
		super.printParent();
		System.out.printf(", 학번:%s\n", stNumber);
	}
	
	/*
	static 메서드는 오버라이딩의 대상이 될 수 없다.
	클래스 외부에 로드되므로 오버라이딩 되지 않고
	호출할때 각 클래스명을 통해 호출해야 한다.
	 */
	public static void staticMethod() {
		System.out.println("학생의 정적메서드");
	}
}
