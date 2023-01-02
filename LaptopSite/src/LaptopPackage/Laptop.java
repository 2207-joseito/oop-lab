package LaptopPackage;

public class Laptop {
	private String brandName, modelName;
	private Double sellingPrice, screenSize;
	private Integer storageCapacity;
	private Boolean isStorageSSD;
	private OS os;

	public Laptop(
		String brandName,
		String modelName,
		Double sellingPrice,
		Double screenSize,
		Integer storageCapacity,
		Boolean isStorageSSD,
		OS os
	) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.sellingPrice = sellingPrice;
		this.screenSize = screenSize;
		this.storageCapacity = storageCapacity;
		this.isStorageSSD = isStorageSSD;
		this.os = os;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public Boolean getIsStorageSSD() {
		return isStorageSSD;
	}

	public void setIsStorageSSD(Boolean isStorageSSD) {
		this.isStorageSSD = isStorageSSD;
	}

	public OS getOs() {
		return os;
	}

	public void setOs(OS os) {
		this.os = os;
	}
}
