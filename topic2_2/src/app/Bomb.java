package app;

public class Bomb extends Weapon {
	@Override
	public void fireWeapon(int power) {
		System.out.println("Class Name: "+this.getClass().getSimpleName());
		System.out.println("Method Name: "+new Throwable().getStackTrace()[0].getMethodName());
		System.out.println("Power: "+ power);
		}
	public void fireWeapon() {
		System.out.println("Class Name: "+this.getClass().getSimpleName());
		System.out.println("Method Name: "+new Throwable().getStackTrace()[0].getMethodName());
		super.fireWeapon(67);
		}
	@Override
	public void activate(boolean enable) {
		System.out.println("Class Name: "+this.getClass().getSimpleName());
		System.out.println("Method Name: "+new Throwable().getStackTrace()[0].getMethodName());
		System.out.println("Enable: "+ enable);
		}
	}

