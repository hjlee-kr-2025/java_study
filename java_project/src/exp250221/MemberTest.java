package exp250221;

import java.util.ArrayList;

public class MemberTest {
	// main() 가 static 이기 때문에 main()에서 사용되는
	// 멤버변수는 static 으로 만들어야 합니다.
	private static ArrayList<Member> memberList = new ArrayList<Member>();

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
				Member member = new Member();
				member.setName(In.getStr("이름"));
				member.setAge(In.getInt("나이"));
				member.setAddress(In.getStr("주소"));
				member.setGender(In.getStr("성별(남자 or 여자)"));
				memberList.add(member);
				System.out.println("회원가입이 완료되었습니다.");
				break; // case "1":
			case "2"://회원정보리스트 : 회원번호, 이름, 나이, 성별
				if (memberList.size() == 0) {
					System.out.println("등록된 회원정보가 없습니다.");
				}
				else {
					System.out.println("=====     회원정보리스트     =====");
					System.out.println("회원번호 |  이름   |  나이  |   성별");
					for (Member m : memberList) {
						String str = m.getNo() + " | " + m.getName() + " | "
							+ m.getAge() + " | " + m.getGender();
						System.out.println(str);
					}
					System.out.println("-------------------------------");
				}
				break; // case "2":
			case "3":// 회원정보 1명 ---> 회원번호를 입력받아 정보를 보여줍니다.
				int no = In.getInt("회원번호를 입력하세요");
				boolean isNotFound = true;	// 회원번호로 회원이 있는지를 알려주는 변수
				for (Member m : memberList) {
					if (m.getNo() == no) {// 입력한 회원번호가 리스트에 있으면?
						// 회원정보 출력
						System.out.println("회원번호 : " + m.getNo());
						System.out.println("이름 : " + m.getName());
						System.out.println("나이 : " + m.getAge());
						System.out.println("주소 : " + m.getAddress());
						System.out.println("성별 : " + m.getGender());
						isNotFound = false;// 있으니까 변수값 변경
						break;// for() 문을 빠져나가는 break문입니다.
					}
				}
				if (isNotFound) {
					System.out.println("*** 회원정보가 없습니다. ***");
				}
				break; // case "3":
			case "4":// 회원삭제 - 회원번호를 가지고 삭제를 진행합니다.
				// case 3에서 no을 int형으로 선언했기 때문에
				// 변수이름으로 사용할 수 있습니다.
				no = In.getInt("회원번호를 입력하세요");
				isNotFound = true;
				for (Member m : memberList) {
					if (m.getNo() == no) {
						memberList.remove(m);
						isNotFound = false;
						System.out.println
						("회원번호:" + m.getNo() +", "
						+ m.getName() + " 회원정보가 삭제되었습니다.");
						break; // for문을 빠져나갑니다.
					}
				}
				if (isNotFound) {
					System.out.println("*** 회원정보가 없습니다. ***");
				}
				break; // case "4":
			case "0":
				System.out.println("회원관리 시스템이 종료됩니다.");
				System.out.println("bye bye....");
				System.out.println();
				return; // 메서드를 빠져나가는 명령입니다.
				// => main()은 리턴자료형이 void이므로 return; 만 적어서
				// 프로그램을 마무리합니다.
			default: //==> menu데이터가 case 에 적힌값이 아닐때 실행되는 부분입니다.
				System.out.println("메뉴에 없는 항목입니다.");
				System.out.println("다시 입력해 주세요");
			}
			
		} // end of while(true)
	} // end of main()
} // end of class
