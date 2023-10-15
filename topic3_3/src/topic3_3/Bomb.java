package topic3_3;

public class Bomb implements WeaponInterface {
	@Override
	public void fireWeapon(int power) {
		//simply print to the console the class name
		System.out.println("Class Name: "+this.getClass().getSimpleName());
		//simply print to the console the method name
		System.out.println("Method Name: "+new Throwable().getStackTrace()[0].getMethodName());
		//simply print to the console method integer power argument
		System.out.println("Power: "+ power);
		}
	public void fireWeapon() {
		//simply print to the console the class name
		System.out.println("Class Name: "+this.getClass().getSimpleName());
		//simply print to the console the method name
		System.out.println("Method Name: "+new Throwable().getStackTrace()[0].getMethodName());
		}
	@Override
	public void activate(boolean enable) {
		//simply print to the console the class name
		System.out.println("Class Name: "+this.getClass().getSimpleName());
		//simply print to the console the method name
		System.out.println("Method Name: "+new Throwable().getStackTrace()[0].getMethodName());
		//simply print to the console method boolean enable argument
		System.out.println("Enable: "+ enable);
		}
}
