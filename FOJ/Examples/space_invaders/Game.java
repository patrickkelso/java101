import java.util.*;

public class Game {

	public static final int WIDTH = 11;
	public static final int HEIGHT = 11;
	private static Scanner keyboard = new Scanner(System.in);
	private PlayerShip player;
	private EnemyShip[] enemies;

	public Game() {
		player = new PlayerShip(WIDTH / 2, HEIGHT - 1);
		enemies = new EnemyShip[5];
		for (int i = 0; i < enemies.length; i++)
			enemies[i] = new EnemyShip((int)(Math.random()*WIDTH), (int)(Math.random()*(HEIGHT-5)), Math.random() > 0.5 ? -1 : 1);
	}

	public void play() {
		do {
			print();
			doMove();
		}
		while (!over());
		print();
		if (anyEnemyLanded())
			System.out.println("You lose!");
		else
			System.out.println("You win!");
	}

	private void print() {
		Screen.clear();
		// print the player.
		player.print();
		// print the enemies.
		for (EnemyShip enemy : enemies) {
			enemy.print();
		}
		Screen.render();
	}

	private boolean over() {
		return !anyAlive() || anyEnemyLanded();
	}

	private boolean anyEnemyLanded() {
		for (EnemyShip enemy : enemies)
			if (enemy.hasLanded())
				return true;
		return false;
	}

	private boolean anyAlive() {
		for (EnemyShip enemy : enemies)
			if (enemy.isAlive())
				return true;
		return false;
	}

	private void doMove() {
		System.out.print("Move (l|r|f): ");
		String response = keyboard.nextLine();
		char move = response.charAt(0);
		switch (move) {
		case 'l': player.move(-1); break;
		case 'r': player.move(1); break;
		case 'f':
			for (EnemyShip enemy : enemies) {
				player.fire(enemy);
			}
			break;
		default: System.out.println("Invalid move"); break;
		}
		for (EnemyShip enemy : enemies) {
			enemy.move();
		}
	}
}
