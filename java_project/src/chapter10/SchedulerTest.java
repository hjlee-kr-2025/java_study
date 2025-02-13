package chapter10;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한 명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		switch (ch) {
		case 'R':
		case 'r':
			scheduler = new RoundRobin();
			break;
		case 'L':
		case 'l':
			scheduler = new LeastJob();
			break;
		case 'P':
		case 'p':
			scheduler = new PriorityAllocation();
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			return ;// 현재 함수를 종료(빠져나가는)
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
