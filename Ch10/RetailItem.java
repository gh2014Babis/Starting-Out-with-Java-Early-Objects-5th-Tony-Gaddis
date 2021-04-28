
public class RetailItem {
	
	private String description;
	private int unitsOnHand;
	private double price;
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setUnitsOnHand(int unitsOnHand) throws InvalidUnits {
		if (unitsOnHand < 0)
			throw new InvalidUnits();
		this.unitsOnHand = unitsOnHand;
	}
	
	public void setPrice(double price) throws InvalidPrice {
		if (price < 0)
			throw new InvalidPrice();
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	
	public double getPrice() {
		return price;
	}
}
