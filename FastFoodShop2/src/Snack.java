
public abstract class Snack {
	private Double price;
	private String name;
	
	public Snack(String  name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void isBeingEaten() {
		System.out.println("... Eating " + this.name + " ...");
	}
}
