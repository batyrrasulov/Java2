package app;
// create a class in the app package defined with a Generic Class Type T
public class Storage <T> {
	// create a private class member variable 
	private T s = null;
	//create a non-default constructor that takes a single method argument
	public Storage(T s) {
		this.s = s;
	}
	// create a public method that returns private class member variable 
	public T getData() {
		return this.s;
	}
	public static void main(String[] args) {
		// instantiate an instance of Storage class to support a String
		Storage <String> storage1 = new Storage <String>("Mohammed Rasulov");
		// call its method that prints its return value to the console
		System.out.println("This is the data from " + storage1.getData());
		// instantiate an instance of Storage class to support an Integer
		Storage <Integer> storage2 = new Storage <Integer>(18);
		// call its method that prints its return value to the console
		System.out.println("He is " + storage2.getData());
	}
}
