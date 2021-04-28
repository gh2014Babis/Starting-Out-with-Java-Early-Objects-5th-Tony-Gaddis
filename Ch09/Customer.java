public class Customer extends Person {

	private int number;
	private boolean mailList;
	
	public Customer(String name, String address, String phone, int number, boolean mailList) {
		super(name, address, phone);
		this.number = number;
		this.mailList = mailList;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setMailList(boolean mailList) {
		this.mailList = mailList;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean getMailList() {
		return mailList;
	}
}