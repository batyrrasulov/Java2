package app;

public class Car {
	//private properties
    private int year;
    private String make;
    private String model;
    private int odometer;
    private double engineLiters;
    //default constructor
    public Car() {
    	year = 0;
    	make = " ";
    	model = " ";
    	odometer = 0;
    	engineLiters = 0;
    }
    //non-default constructor
    public Car(int year, String make, String model, int odometer, double engineLiters) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.engineLiters = engineLiters;
    }
    //getter methods
    public int getYear() {
    	return year; 
    	}
    public String getMake() { 
    	return make; 
    	}
    public String getModel() { 
    	return model; 
    	}
    public int getOdometer() { 
    	return odometer; 
    	}
    public double getEngineLiters() { 
    	return engineLiters; 
    	}
    //setter methods
    public void setYear(int year) { 
    	this.year = year; 
    	}
    public void setMake(String make) { 
    	this.make = make; 
    	}
    public void setModel(String model) { 
    	this.model = model; 
    	}
    public void setOdometer(int odometer) { 
    	this.odometer = odometer; 
    	}
    public void setEngineLiters(double engineLiters) { 
    	this.engineLiters = engineLiters; 
    	}
    //optional main method
    public static void main(String[] args) {
        // Create a Car object with default constructor
        Car defaultCar = new Car();
        // Create a Car object with non-default constructor
        Car nonDefaultCar = new Car(2022, "Toyota", "Camry", 0, 2.5);
        // Test getters and setters
        nonDefaultCar.setOdometer(10000);
        System.out.println(nonDefaultCar.getOdometer()); // Output: 10000
    }
}
