package LaptopPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class LaptopDB {
	private HashMap<String, Laptop> laptopsMap;
	
	public LaptopDB(HashMap<String, Laptop> laptopsMap) {
		this.laptopsMap = laptopsMap;
	}
	
	public ArrayList<Laptop> listAllLaptops() {
		return new ArrayList<Laptop>(this.laptopsMap.values());
	}
	
	public ArrayList<Laptop> listLaptopsByBrand(String brandName) {
		ArrayList<Laptop> laptopsList = new ArrayList<Laptop>();

		for(Laptop laptop : this.laptopsMap.values()){    
			if(laptop.getBrandName() == brandName)
				laptopsList.add(laptop);
		}

		return laptopsList;
	}
	
	public ArrayList<Laptop> listLaptopsBySellingPrice(Boolean isLessThan, Double amount) {
		ArrayList<Laptop> laptopsList = new ArrayList<Laptop>();
		
		for(Laptop laptop : this.laptopsMap.values()){
			if(isLessThan) {
				if(laptop.getSellingPrice() < amount)
					laptopsList.add(laptop);
			} else {
				if(laptop.getSellingPrice() >= amount)
					laptopsList.add(laptop);
			}
		}
		
		return laptopsList;
	}
	
	public ArrayList<Laptop> filterLaptopsByScreenSize(Double screenSize) {
		ArrayList<Laptop> laptopsList = new ArrayList<Laptop>();
		for(Laptop laptop : this.laptopsMap.values()){
			if(laptop.getScreenSize().equals(screenSize))
				laptopsList.add(laptop);
		}
		
		return laptopsList;
	}
	
	public ArrayList<Laptop> filterLaptopsByMinStorageCapacity(Integer minStorageCapacity) {
		ArrayList<Laptop> laptopsList = new ArrayList<Laptop>();
		
		for(Laptop laptop : this.laptopsMap.values()){
			if(laptop.getStorageCapacity() >= minStorageCapacity)
				laptopsList.add(laptop);
		}
		
		return laptopsList;
	}
	
	public ArrayList<Laptop> filterLaptopsByHasSSD(Boolean isSSD) {
		ArrayList<Laptop> laptopsList = new ArrayList<Laptop>();
		
		for(Laptop laptop : this.laptopsMap.values()){    
			if(laptop.getIsStorageSSD() == isSSD)
				laptopsList.add(laptop);
		}
		
		return laptopsList;
	}
	
	public ArrayList<Laptop> filterLaptopsByOS(OS os) {
		ArrayList<Laptop> laptopsList = new ArrayList<Laptop>();
		
		for(Laptop laptop : this.laptopsMap.values()){    
			if(laptop.getOs() == os)
				laptopsList.add(laptop);
		}
		
		return laptopsList;
	}
	
	public HashMap<String, Laptop> getLaptopsMap() {
		return laptopsMap;
	}

	public void setLaptopsMap(HashMap<String, Laptop> laptopsMap) {
		this.laptopsMap = laptopsMap;
	}
	
}
