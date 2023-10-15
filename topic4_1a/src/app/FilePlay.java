/**
 * 
 */
package app;
import java.io.*;
/**
 * @author batyrrasulov
 *
 */
public class FilePlay {
	// a private static method to copy a file from the input file to the output file
	// which also returns 0 if successful, and -1 if the input file is not found, and -2 if there is no an I/O error
	private static int copyFile(String inputFileName, String outputFileName) {
		// declare variables for the reader, writer, and status code
		FileReader reader = null;
		FileWriter writer = null;
		int statusCode = 0;
		
		try {
			// create a new FileReader and FileWriter using the input and output file names
			reader = new FileReader(inputFileName);
			writer = new FileWriter(outputFileName);
			// read characters from the input file using the read() method of FileReader
			int c;
			while ((c = reader.read()) != -1) {
				// write each character to the output file using the write() method of FileWriter
				writer.write(c);
			}
		} catch (FileNotFoundException e) {
			// if the input file is not found, set the status code to -1 and display an error message
			statusCode = -1;
			System.err.println("Error: file not found.");
		} catch (IOException e) {
			// if there is an I/O error, set the status code to -2 and displaye an error message
			statusCode = -2;
			System.err.println("Error: I/O error.");
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
			}
		}
		// return the status code
		return statusCode;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// set the inut and output file names
		String inputFileName = "/Users/batyrrasulov/workspaceCST-239/topic4_1a/src/app/InFile.txt";
		String outputFileName = "/Users/batyrrasulov/workspaceCST-239/topic4_1a/src/app/OutFile.txt";
		// call the copyFile() method with the input and output file names
		int statusCode = copyFile(inputFileName, outputFileName);
		// display an appropriate message based on the status code returned by copyFile() method
		switch (statusCode) {
		case 0:
			System.out.println("File copied successfully.");
			break;
		case -1:
			System.err.println("Error: file not found.");
			break;
		case -2:
			System.err.println("Error: I/O error.");
			break;
		default:
			System.err.println("Unkown error.");
			break;
		}
	}
}
