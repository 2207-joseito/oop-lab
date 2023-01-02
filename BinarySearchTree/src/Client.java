import LaptopPackage.Laptop;
import bst.BSTree;

public class Client {

	public static void main(String[] args) {
	
		BSTree tree = new BSTree() {{
			insert(new Laptop("dellXPS-14", 10.00));
			insert(new Laptop("appleMBP-14", 5.00));
			insert(new Laptop("hpDV6000", 9.00));
			insert(new Laptop("hpDV7000", 4.00));
		}};
		
		
		
		tree.print();
		
	}

}
