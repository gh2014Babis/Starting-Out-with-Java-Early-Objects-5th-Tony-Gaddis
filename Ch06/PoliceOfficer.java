
public class PoliceOfficer {
	
	private String name;
	private String badgeNumber;
	private ParkedCar pc;
	private ParkingMeter pm;
	
	public PoliceOfficer(String name, String badgeNumber, ParkedCar pc, ParkingMeter pm) {
		this.name = name;
		this.badgeNumber = badgeNumber;
		this.pc = pc;
		this.pm = pm;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}
	
	public ParkingTicket check() {
		if (pc.getParkedMinutes() > pm.getPurchasedMinutes()) 
			return new ParkingTicket(pc, pm, name, badgeNumber);
		return null;
	}
}
