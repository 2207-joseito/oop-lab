
public class FastFoodShop {
	private String location;

	public FastFoodShop(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void showMenu() {
		System.out.println("\n~~~~~~~~Menu~~~~~~~~");
		System.out.println("VegItems:");
		System.out.println("VadaPav \t PaneerSamosas");
		System.out.println("CheeseSandwich \t AlooBurger");
		System.out.println("\nNonVegItems:");
		System.out.println("Shaworma \t PrawnPattis");
		System.out.println("ChickenPizza \t EggRoll\n\n");
	}
	
	public Snack order(String snackType) {
		switch (snackType) {
			case "VadaPav": 
				return new VadaPav();
			
			case "PaneerSamosas":
				return new PaneerSamosa();
			
			case "CheeseSandwich":
				return new CheeseSandwich();
			
			case "AlooBurger":
				return new AlooBurger();
			
			case "Shaworma":
				return new Shaworma();
			
			case "PrawnPattis":
				return new PrawnPattis();
				
			case "ChickenPizza":
				return new ChickenPizza();
			
			case "EggRoll":
				return new EggRoll();
				
			default:
				return null;
		}
	}
}
