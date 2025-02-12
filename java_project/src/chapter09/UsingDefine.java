package chapter09;

public class UsingDefine {
	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING);
		System.out.println("최소값은 " + Define.MIN + "입니다.");
		System.out.println("최대값은 " + Define.MAX + "입니다.");
		System.out.println("수학과목의 코드값은 " + Define.MATH
				+ "입니다.");
		System.out.println("영어과목의 코드값은 " + Define.ENG
				+ "입니다.");
		System.out.println("파이값은 " + Define.PI + "를 사용합니다.");
	}
}
