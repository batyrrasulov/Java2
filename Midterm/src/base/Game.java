package base; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//create executing main class 
public class Game {
	//main method
	public static void main(String[] args) {
    	//welcome statement
        System.out.println("Welcome! My name is Batyr Rasulov.");
        //get the engine and tire and assign them to certain data
        Engine engine = new Engine(500, "Gasoline");
        Tire tire = new Tire(30, "Racing");
        //call both car methods
        Nascar nascar = new Nascar(2021, "Chevrolet", "Camaro", engine, tire, 42, "Hendricks Racing");
        IndyCar indycar = new IndyCar(2022, "Honda", "IndyCar", engine, tire,  9, "Ghannassi Racing");
        //create an ArrayList
        List<Car> cars = new ArrayList<>();
        //add the cars with creating .add function method
        cars.add(nascar);
        cars.add(indycar);
        //sort the cars by their year
        Collections.sort(cars);
        //for loop iteration to make the cars starting the Car, starting the Engine, enabling the Turbo, and finally stopping the Engine and the Car
        for (Car car : cars) {
        	car.start();
            car.engine.start();
            car.tire.start();
            car.enableTurbo();
            car.tire.stop();
            car.engine.stop();
            car.stop();
        }
    }
}
