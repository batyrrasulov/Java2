//declare package base
package base;
//create an asbtract class 
public abstract class Car implements Comparable<Car> {
	//instance variables
    private int year;
    private String make;
    private String model;
    Engine engine;
    Tire tire;
    //method
    public Car(int year, String make, String model, Engine engine, Tire tire) {
    	this.year = year;
        this.setMake(make);
        this.setModel(model);
        this.engine = engine;
        this.tire = tire;
        }
    //function method to make the car start
    public void start() {
    	System.out.println("Starting the car");
    	}
    //function method to make the car run
    public void run() {
    	System.out.println("Car is running");
    	}
    //function method to make the car stop
    public void stop() {
        System.out.println("Stopping the car");
        }
    //method to enable the Turbo
    public abstract void enableTurbo();
    //method to compare the cars by their production years
    public int compareTo(Car other) {
    	return this.year - other.year;
    }
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
}