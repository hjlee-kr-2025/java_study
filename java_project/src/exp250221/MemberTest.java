package exp250221;

import java.util.ArrayList;

public class MemberTest {
	private ArrayList<Member> memberList = new ArrayList<Member>();

	public static void main(String[] args) {
		System.out.println("-------------------------");
		System.out.println("-- 회원 관리 시스템 입니다. --");
		System.out.println("-------------------------");
		
		while (true) {
			System.out.println("------    메뉴  --------");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원리스트");
			System.out.println("3. 회원정보");
			System.out.println("4. 회원탈퇴");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			String menu = In.getStr("메뉴입력");
			
			switch (menu) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "0":
				break;
			default:
			}
			
		} // end of while(true)
	} // end of main()
} // end of class
