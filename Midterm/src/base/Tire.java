package base;

public class Tire {
	//optionally created variables to have a tire's pressure and type
    private int tirePressure;
    private String tireType;
    //called tire method
    public Tire(int tirePressure, String tireType) {
        this.setTirePressure(tirePressure);
        this.setTireType(tireType);
        }
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting the tire");
		}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping the tire");
		}
	/**
	 * @return the tirePressure
	 */
	public int getTirePressure() {
		return tirePressure;
	}
	/**
	 * @param tirePressure the tirePressure to set
	 */
	public void setTirePressure(int tirePressure) {
		this.tirePressure = tirePressure;
	}
	/**
	 * @return the tireType
	 */
	public String getTireType() {
		return tireType;
	}
	/**
	 * @param tireType the tireType to set
	 */
	public void setTireType(String tireType) {
		this.tireType = tireType;
	}
	}