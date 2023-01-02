package testsystem;

public abstract class HomeAppliance extends Appliance implements WifiEnabledDevice {
	protected Boolean isWifiEnabled;
	
	public HomeAppliance() {
		super();
	}

	@Override
	public void turnOnWifi() {
		System.out.println("Wifi: turned on....");
	}

	@Override
	public void turnOffWifi() {
		System.out.println("Wifi: turned off....");
	}

}
