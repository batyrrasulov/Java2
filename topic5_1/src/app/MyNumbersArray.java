package app;
// create/copy class from MyArray and name it MyNumbersArray
public class MyNumbersArray {
	// Update this method to restrict the Method Generic Type to a Number type
	public <E extends Number> void printArray(E[] inputArray) {
		// iterate over the array and print each element
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
	}
	public static void main(String[] args) {
		//create arrays of Integer, Double and Float 
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Float[] floatArray = { 0.0f, 1.0f, 2.5f, 3.5f };
		// instantiate an instance of MyNumbersArray class and print each array out by calling its method
		MyNumbersArray ma = new MyNumbersArray();
		System.out.println("Array integerArray contains:");
		// pass an Integer array
		ma.printArray(intArray);
		System.out.println("\nArray doubleArray contains:");
		// pass a Double array
		ma.printArray(doubleArray);
		System.out.println("\nArray floatArray contains:");
		// pass a Float array
		ma.printArray(floatArray);
	}
}
