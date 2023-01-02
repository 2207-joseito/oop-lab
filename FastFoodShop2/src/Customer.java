import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {
		System.out.println("Fast Food Shop\n");
		
		FastFoodShop shop = new FastFoodShop("Panjim");	
		System.out.println("Welcome to our " + shop.getLocation() + " outlet.");
		
		shop.showMenu();
		
		ArrayList<String> snackList = new ArrayList<>() {
			{
				add("VadaPav");
				add("Shaworma");
			}
		};
		
		ArrayList<Snack> snacks = shop.order(snackList);
		
		shop.printInvoice(snacks);
		
		for (Snack snack : snacks)
			snack.isBeingEaten();

	}

}
