/**
 * 
 */
package app;

/**
 * @author batyrrasulov
 *
 */
public class Person {
	private int age;
	private String name;
	private float height;
	public Person(int age, String name, float height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public float getHeight() {
		return height;
	}
	public void playTennis() {
		System.out.println("I play tennis");
	}
	public void watchMovie() {
		System.out.println("I watch movies");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person(18, "Mohammed", (float) 6);
		System.out.println("My name is " + person.getName());
		System.out.println("I am " + person.getAge());
		System.out.println("My height is " + person.getHeight());
		person.playTennis();
		person.watchMovie();
	}
}
