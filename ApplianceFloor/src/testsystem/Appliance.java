package testsystem;

public abstract class Appliance {
	protected String brand;
	
	public Appliance() {
		super();
		this.brand = "";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void powerOn() {
		System.out.println("Appliance powered on.....");
	}
	
	public void powerOff() {
		System.out.println("Appliance powered off.....");
	}
	
	public abstract Boolean test();
}
