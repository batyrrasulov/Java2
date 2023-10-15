/**
 * 
 */
package app;
import java.io.*;

/**
 * Class to demonstrate file copying with exception handling.
 * This version of the class throws the exceptions from the copyFile() method signature and returns void.
 */
public class FilePlay {
	// a private static method to copy a file from the input file to the output file
	// throws FileNotFoundException and IOException
	private static void copyFile(String inputFileName, String outputFileName) throws FileNotFoundException, IOException {
		// declare variables for the reader and writer
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			// create a new FileReader and FileWriter using the input and output file names
			reader = new BufferedReader(new FileReader(inputFileName));
			writer = new BufferedWriter(new FileWriter(outputFileName));
			// reads a line from the input file, splits the line into tokens with a regex delimiter of a pipe and writes each of the tokens to the output file 
			String line;
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split("\\|");
				writer.write(String.format("Name is %s %s of age %s\n", tokens[0], tokens[1], tokens[2]));
			}
		} finally {
			// close the reader and writer in a finally block to ensure they are closed even if an exception is thrown
			try {
				if (reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				// if there is an error closing the reader or writer, display an error message
				System.err.println("Error closing file: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// set the input and output file names
		String inputFileName = "/Users/batyrrasulov/workspaceCST-239/topic4_1d/src/app/InFile.txt";
		String outputFileName = "/Users/batyrrasulov/workspaceCST-239/topic4_1d/src/app/OutFile.txt";

		try {
			// call the copyFile() method with the input and output file names
			FilePlay.copyFile(inputFileName, outputFileName);
			// display a success message
			System.out.println("File copied successfully.");
		} catch (FileNotFoundException e) {
			// if the input file is not found, display an error message
			System.err.println("Error: file not found.");
			e.printStackTrace();
		} catch (IOException e) {
			// if there is an I/O error, display an error message
			System.err.println("Error: I/O error.");
			e.printStackTrace();
		}
	}
}
