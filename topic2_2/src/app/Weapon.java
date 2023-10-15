package app;

public abstract class Weapon {
	public void fireWeapon(int power) {
		System.out.println("Class Name: "+this.getClass().getSimpleName());
		System.out.println("Method Name: "+new Throwable().getStackTrace()[0].getMethodName());
		System.out.println("Power: "+ power);
		}
	public abstract void activate(boolean enable);
	}
