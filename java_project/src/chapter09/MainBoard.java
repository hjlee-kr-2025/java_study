package chapter09;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		// => 처음 생성시 초급자 레벨
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);// 중급자 레벨
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);// 고급자 레벨
		player.play(3);
	}
}
