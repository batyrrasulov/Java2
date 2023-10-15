package base;
//first car created 
public class IndyCar extends Car {
	//optionally created an a variable carNum of type int
    private int carNumber;
    private String sponsor;
    //inherited method with super to call the IndyCar
    public IndyCar(int year, String make, String model, Engine engine, Tire tire, int carNumber, String sponsor) {
        super(year, make, model, engine, tire);
        this.setCarNumber(carNumber);
        this.setSponsor(sponsor);
    }
    //method to enable turbo
    public void enableTurbo() {
        System.out.println("Enabling turbo for Indycar");
    }
	/**
	 * @return the carNumber
	 */
	public int getCarNumber() {
		return carNumber;
	}
	/**
	 * @param carNumber the carNumber to set
	 */
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	/**
	 * @return the sponsor
	 */
	public String getSponsor() {
		return sponsor;
	}
	/**
	 * @param sponsor the sponsor to set
	 */
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
}