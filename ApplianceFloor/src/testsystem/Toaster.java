package testsystem;

public class Toaster extends KitchenAppliance {

	public Toaster() {
		super();
	}
	
	@Override
	public Boolean test() {
		try {
			this.powerOn();
			this.powerOff();
			System.out.println("Pass: Tested OK");
			return true;
		} catch (Exception e) {
			System.out.println("Failed: " + e.getMessage());
			return false;
		}
	}

}
