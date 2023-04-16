package milestone6;

public class Main {
	public static void main(String[] args) {
		// StoreFront thread
		StoreFront storeFrontRunnable = new StoreFront();
		Thread storeFrontThread = new Thread(storeFrontRunnable);
		storeFrontThread.setName("StoreFront");
		// Admin thread
		Admin adminRunnable = new Admin();
		Thread adminThread = new Thread(adminRunnable);
		adminThread.setName("Admin");
		adminThread.setDaemon(true);
		// start Admin
		adminThread.start();
		// start Store Front
		storeFrontThread.start();
	}
}
