
public class ParkingTicket {
	
	private ParkedCar pc;
	private ParkingMeter pm;
	private PoliceOfficer po;
	
	public ParkingTicket(ParkedCar pc, ParkingMeter pm, String name, String badgeNumber) {
		this.pc = pc;
		this.pm = pm;
		this.po = new PoliceOfficer(name, badgeNumber, pc, pm);
	}
	
	public void report1() {
		System.out.println("Parked Car");
		System.out.println(pc.getMake());
		System.out.println(pc.getModel());
		System.out.println(pc.getColor());
		System.out.println(pc.getLicenseNum());
	}
	
	public void report2() {
		double parkedHours = (double)pc.getParkedMinutes() / 60; 
		double purchasedHours = (double)pm.getPurchasedMinutes() / 60; 
		double sub = parkedHours - purchasedHours;
		double fine;
		if (sub <= 1) {
			fine = 25;
		} else {
			if ((int)sub == sub) 
				fine = 25 + (sub - 1) * 10;
			else
				fine = 25 + (int)sub * 10;
		}
		System.out.println("Fine: $" + fine);
	}
	
	public void report3() {
		System.out.println("Name of police officer: " + po.getName());
		System.out.println("Badge number: " + po.getBadgeNumber());
	}
}
