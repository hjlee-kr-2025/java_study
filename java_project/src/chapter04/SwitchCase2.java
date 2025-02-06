package chapter04;

public class SwitchCase2 {

	// month(월) 에 따른 몇일까지 있는지? 를 화면에 알려주려고 합니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 11;
		int day = 0;
		
		// switch~case 문에서는 break를 만나야 블럭을 빠져나가는
		// 성질을 이용해서
		// 같은 처리를 하는 case문을 하나로 합쳐서 구현할 수 있습니다.
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		}
		System.out.println(month + "월은 " + day + "일 까지 있습니다.");
	}

}
