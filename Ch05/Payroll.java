
public class Payroll {
	
	private int id;
	private double grossPay;
	private double stateTax;
	private double federalTax;
	private double fica;
	
	public Payroll(int id, double grossPay, double stateTax, double federalTax, double fica) {
		this.id = id;
		this.grossPay = grossPay;
		this.stateTax = stateTax;
		this.federalTax = federalTax;
		this.fica = fica;
	}
	
	public int getID() {
		return id;
	}
	
	public double getNetPay() {
		return (grossPay - stateTax - federalTax - fica);
	}
}
