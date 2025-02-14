package chapter11;

/*
 * enum은 상수집합을 클래스처럼 사용하도록 해줍니다.
 */
public enum GameLevel {
	BEGINER_LEVEL(1, "초보자"),
	ADVANCED_LEVEL(2, "숙련자"),
	SUPER_LEVEL(3, "고수");
	
	private int level;
	private String hint;
	
	GameLevel(int level, String hint) {
		this.level = level;
		this.hint = hint;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String getHint() {
		return hint;
	}
	
	public String toString() {
		return getHint();
	}
	
	public static void main(String[] args) {
		/*GameLevel[] gameLevels = GameLevel.values();
		for (GameLevel level : gameLevels) {
			System.out.println(level);
		}*/
		// enum 클래스의 valueOf("상수이름");
		// 상수이름으로 선언한 값을 변수에 담습니다.
		GameLevel gameLevel = GameLevel.valueOf("BEGINER_LEVEL");
		System.out.println(gameLevel.getLevel());
		System.out.println(gameLevel.getHint());
	}
}




