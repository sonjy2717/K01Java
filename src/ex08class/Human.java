package ex08class;

/*
시나리오]
다음에 주어진 조건으로 '사람'을 추상화 하시오
- 속성 : 이름, 나이, 에너지
- 행동 : 걷는다, 생각한다, 먹는다, 현재상태표현
- 행동의 조건
	먹으면 에너지가 2 증가
	걸으면 에너지가 1 감소
	생각하면 에너지가 2 감소
	단, 에너지의 최초/최대 범위는 0~10으로 한다
	무한히 먹을 수 없고, 에너지는 마이너스가 될 수 없기 때문
 */
public class Human {
	
	// 객체의 속성을 표현하는 멤버 변수
	String name;
	int age;
	int energy;
	
	// 행동을 표현하는 멤버 메서드
	void walking() {
		
		energy--;
		
		if (energy < 0) {
			energy = 0;
			System.out.println("[walk]에너지는 0이 최소입니다");
			System.out.println("0으로 고정됩니다");
		}
		else {
			System.out.println("[walk]에너지가 1 감소하였습니다");
		}
	}
	
	void thinking() {
		
		energy -= 2;
		
		if (energy < 0) {
			energy = 0;
			System.out.println("[thinking]에너지는 0이 최소입니다");
			System.out.println("0으로 고정됩니다");
		}
		else {
			System.out.println("[thinking]에너지가 2 감소하였습니다");
		}
	}
	
	void eating() {
		
		energy += 2;
		
		if (energy > 10) {
			energy = 10;
			System.out.println("[eat]에너지는 0이 최대치입니다");
		}
		else {
			System.out.println("[eat]에너지가 2 증가하였습니다");
		}
	}
	
	void showState() {
		
		System.out.println("===님의 현재상태는===");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("에너지: " + energy);
		System.out.println("=====================");
	}
}
