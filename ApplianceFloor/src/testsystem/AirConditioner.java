package testsystem;

public class AirConditioner extends HomeAppliance {

	public AirConditioner() {
		this.isWifiEnabled = false;
	}
	
	public AirConditioner(Boolean isWifiEnabled) {
		this.isWifiEnabled = isWifiEnabled;
	}
	
	@Override
	public Boolean test() {
		try {
			this.powerOn();

			if (this.isWifiEnabled) {
				this.turnOnWifi();
				this.turnOffWifi();
			}
			
			this.powerOff();
			
			System.out.println("Pass: Tested OK");
			return true;
		} catch (Exception e) {
			System.err.println("Failed: " + e.getMessage());
			return false;
		}
	}
}
