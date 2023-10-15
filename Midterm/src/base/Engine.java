package base;

public class Engine {
	//optionally created variables to have a engine's horsePower and type
    private int horsePower;
    private String engineType;
    //called engine method
    public Engine(int horsePower, String engineType) {
        this.setHorsePower(horsePower);
        this.setEngineType(engineType);
        }
    //method to start the engine
    public void start() {
        System.out.println("Starting the engine");
        }
    //method to stop the engine
    public void stop() {
        System.out.println("Stopping the engine");
        }
	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}
	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	/**
	 * @return the engineType
	 */
	public String getEngineType() {
		return engineType;
	}
	/**
	 * @param engineType the engineType to set
	 */
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
    }