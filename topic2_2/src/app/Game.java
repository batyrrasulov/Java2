package app;

public class Game {
	public static void main(String args[]) {
		Bomb b = new Bomb();
		Gun g = new Gun();
		b.activate(true);
		g.activate(true);
		b.fireWeapon(45);
		g.fireWeapon(60);
		b.fireWeapon();
		g.fireWeapon();
		}
	}
