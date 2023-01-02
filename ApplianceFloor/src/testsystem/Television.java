package testsystem;

public class Television extends HomeAppliance {
	public Television () {
		this.isWifiEnabled = true;
	}
	
	public Television(Boolean isWifiEnabled) {
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
