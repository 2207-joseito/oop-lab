
public class Customer {

	public static void main(String[] args) {
		System.out.println("Fast Food Shop\n");
		
		FastFoodShop shop = new FastFoodShop("Panjim");	
		System.out.println("Welcome to our " + shop.getLocation() + " outlet.");
		
		shop.showMenu();
		
		Snack snack = shop.order("VadaPav");
		snack.isBeingEaten();
		
		Snack snack2 = shop.order("ChickenPizza");
		snack2.isBeingEaten();
	}

}
