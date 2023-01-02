package testsystem;

public class MixerGrinder extends KitchenAppliance {

	public MixerGrinder() {
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
