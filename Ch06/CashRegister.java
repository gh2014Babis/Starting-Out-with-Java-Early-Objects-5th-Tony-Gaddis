
public class CashRegister {
	
	private RetailItem ri;
	private int quantity;
	
	public CashRegister(RetailItem ri, int quantity) {
		this.ri = ri;
		this.quantity = quantity;
	}
	
	public double getSubtotal() {
		return quantity * ri.getRetail();
	}
	
	public double getTax() {
		return 0.06 * getSubtotal();
	}
	
	public double getTotal() {
		return getSubtotal() + getTax();
	}
}
