package LaptopPackage;

public class Laptop {
	private String model;
	private Double price;
	
	public Laptop(String modelName, Double sellingPrice) {
		this.model = modelName;
		this.price = sellingPrice;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
