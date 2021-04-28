public class PreferredCustomer extends Customer {

	private double purchases;
	private double discount;
	
	public PreferredCustomer(String name, String address, String phone, int number, boolean mailList) {
		super(name, address, phone, number, mailList);
		purchases = 0;
		discount = 0;
	}
	
	public PreferredCustomer(String name, String address, String phone, int number, boolean mailList, double purchases) {
		super(name, address, phone, number, mailList);
		setPurchases(purchases);
	}
	
	public void setPurchases(double purchases) {
		this.purchases = purchases;
		setDiscount();
	}
	
	public void setDiscount() {
		if (purchases == 500)
			this.discount = 0.05;
		else if (purchases == 1000)
			this.discount = 0.06;
		else if (purchases == 1500)
			this.discount = 0.07;
		else if (purchases >= 2000)
			this.discount = 0.1;
		else
			this.discount = 0;
	}
	
	public double getPurchases() {
		return purchases;
	}
	
	public double getDiscount() {
		return discount;
	}
}