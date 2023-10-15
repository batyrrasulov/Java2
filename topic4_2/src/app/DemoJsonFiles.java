package app;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoJsonFiles {
	//method named saveToFile() that will serialize a Car Object to JSON file using Jackson library
    public static void saveToFile(String fileName, Car car, boolean append) {
    	PrintWriter pw;
        try {
        	//create a file File to write
        	File file = new File(fileName);
        	FileWriter fw = new FileWriter(file, append);
        	pw = new PrintWriter(fw);
        	//write Car as JSON
        	ObjectMapper objectMapper = new ObjectMapper();
        	String json = objectMapper.writeValueAsString(car);
        	pw.println(json);
        	//clean up
        	pw.close();
        } catch (IOException e) {
        	//print exception
            e.printStackTrace();
        }
    }
    private static ArrayList<Car> readFromFile(String fileName) {
    	ArrayList<Car> cars = new ArrayList<Car>();
    	try {
    		//open the file File to read
    		File file = new File(fileName);
    		Scanner s = new Scanner(file);
    		//create list of Cars by reading JSON file
    		while(s.hasNext()) {
    			//read a string of JSON and convert to a Car
    			String json = s.nextLine();
    			ObjectMapper objectMapper = new ObjectMapper();
    			Car car = objectMapper.readValue(json, Car.class);
    			cars.add(car);
    		}
    		//clean up
    		s.close();
    	}
    	catch (IOException e) {
    		//print exception
    		e.printStackTrace();
    	}
    	//return the list of Cars
    	return cars;
    }
    public static void main(String[] args) throws IOException {
    	//create some Cars using an array
        Car[] cars = new Car[5];
        cars[0] = new Car(2022, "Toyota", "Camry", 0, 2.5);
        cars[1] = new Car(2021, "Honda", "Civic", 10000, 1.5);
        cars[2] = new Car(2020, "Ford", "Mustang", 20000, 5.0);
        cars[3] = new Car(2018, "Chevy", "Blazer", 1000, 1.5);
        cars[4] = new Car(2010, "GMC", "Silverado", 10000, 3.5);
        //write the Cars to a file as JSON
        for(int x = 0; x < 4; x++) {
        	//write Car to a file as JSON
        	saveToFile("out.json", cars[x], true);
        }
        //read the Cars from the file and print out
        ArrayList <Car> carsList = readFromFile("out.json");
        for (Car car : carsList) {
        	String text = Integer.toString(car.getYear()) + "," +
                                                    car.getMake() + "," +
        			                                car.getModel() + "," +
                                                    Integer.toString(car.getOdometer()) + "," +
        			                                Double.toString(car.getEngineLiters());
        	System.out.println(text);
        }
    }
}
