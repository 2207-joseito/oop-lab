import java.util.ArrayList;
import java.util.HashMap;
import LaptopPackage.Laptop;
import LaptopPackage.LaptopDB;
import LaptopPackage.OS;

public class ClientApp {
	
	static void printDetails(ArrayList<Laptop> laptopList) {
		for (Laptop laptop : laptopList)
			System.out.println(
				"\nBrand:        " + laptop.getBrandName() +
				"\nModel:        " + laptop.getModelName() +
				"\nPrice:        " + laptop.getSellingPrice() + 
				"\nScreen Size:  " + laptop.getScreenSize() +
				"\nStorage:      " + laptop.getStorageCapacity() + " GB" +
				"\nStorage Type: " + (laptop.getIsStorageSSD() ? "SSD" : "HDD")
			);
	}

	public static void main(String[] args) {
		HashMap<String, Laptop> laptopsMap = new HashMap<String, Laptop>() {{
			put("lenovoE41-24", new Laptop("lenovo", "E41-24", 19999.99, 13.5, 500, false, OS.WINDOWS));
			put("dellXPS-14", new Laptop("dell", "XPS-14", 99999.99, 15.0, 1000, true, OS.WINDOWS));
			put("appleMBP-14", new Laptop("apple", "MBP-14", 149999.99, 14.0, 256, true, OS.MAC));
			put("hpDV6000", new Laptop("hp", "DV6000", 50000.00, 14.5, 256, true, OS.LINUX));
		}};
		
		
		LaptopDB laptopDB = new LaptopDB(laptopsMap);
		
		printDetails(laptopDB.listAllLaptops());
//		printDetails(laptopDB.listLaptopsByBrand("dell"));
//		printDetails(laptopDB.listLaptopsBySellingPrice(true, 60000.00));
//		printDetails(laptopDB.listLaptopsBySellingPrice(false, 60000.00));
//		printDetails(laptopDB.filterLaptopsByScreenSize(14.0));
//		printDetails(laptopDB.filterLaptopsByMinStorageCapacity(256));
//		printDetails(laptopDB.filterLaptopsByHasSSD(true));
//		printDetails(laptopDB.filterLaptopsByHasSSD(false));
//		printDetails(laptopDB.filterLaptopsByOS(OS.WINDOWS));
	}

}
