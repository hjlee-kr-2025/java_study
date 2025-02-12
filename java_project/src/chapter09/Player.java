package chapter09;

public class Player {
	private PlayerLevel level;
	
	// 생성자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	// getter
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
		
	}
}
