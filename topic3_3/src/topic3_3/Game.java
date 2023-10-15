package topic3_3;

public class Game {
	//private helper method that takes weapon as an argument
	private static void fireWeapon(WeaponInterface weapon) {
			if (weapon instanceof Bomb) 
				System.out.println("---------> I am a Bomb");
			if (weapon instanceof Gun) 
				System.out.println("---------> I am a Gun");
			//activate weapon
			weapon.activate(true);
			//fire the weapon
			weapon.fireWeapon(5);
		}
	public static void main(String[] args) {
		//create an array of WeaponInteface and initialize to specific weapon of Bomb and Gun
		WeaponInterface[] weapons = new WeaponInterface[2];
		//initialize the first array element with an instance of Bomb
		weapons[0] = new Bomb();
		//initialize the second array element with an instance of Gun
		weapons[1] = new Gun();
		//for all weapons fire them and loop over the array for the helper method
		for (int x = 0; x < weapons.length; x++) {
			fireWeapon(weapons[x]);
		}
	}
}
