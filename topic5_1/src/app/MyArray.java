package app;
// create a class in the app package
public class MyArray {
	// create a public method that takes a single method argument of a generic array of type E
	public <E> void printArray(E[] inputArray) {
		// iterate over the array and print each element
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
	}
	public static void main(String[] args) {
		// create arrays of Integer , Double and Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		// instantiate an instance of MyArray class and print each array out by calling its method
		MyArray ma = new MyArray();
		System.out.println("Array integerArray contains:");
		// pass an Integer array
		ma.printArray(intArray);
		System.out.println("\nArray doubleArray contains:");
		//pass a Double array
		ma.printArray(doubleArray);
		System.out.println("\nArray characterArray contains:");
		//pass a Character array
		ma.printArray(charArray);
	}
}
