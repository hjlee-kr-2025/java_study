package chapter04;

public class SwitchCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제: 5층 건물이 있습니다.
		// floor에 따라서 화면에 출력해줍니다.
		// 1: 약국, 2: 정형외과, 3: 피부과, 4: 치과, 5: 헬스클럽
		// 출력은 1층예로 : "1층 약국 입니다."
		// switch ~ case 문을 사용해서 구현해 주세요
		int floor = 3;
		
		switch (floor) {
		case 1:
			System.out.println("1층 약국입니다.");
			// System.out.println(floor + "층 약국입니다");
			break;
		case 2:
			System.out.println("2층 정형외과입니다.");
			break;
		case 3:
			System.out.println("3층 피부과입니다.");
			break;
		case 4:
			System.out.println("4층 치과입니다.");
			break;
		case 5:
			System.out.println("5층 헬스클럽입니다.");
			break;
		}

	}

}
