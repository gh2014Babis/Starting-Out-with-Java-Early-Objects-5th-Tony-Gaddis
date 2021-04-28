public class Challenge03 {
	
	public static void main(String[] args) {
		TeamLeader tl = new TeamLeader("Babis", "123-A", "03/09/2020", 1, 8, 3000, 60, 34);
		System.out.println("Name: " + tl.getName());
		System.out.println("Employee number: " + tl.getEmployeeNumber());
		System.out.println("Hire date: " + tl.getHireDate());
		System.out.println("Shift: " + tl.getShift());
		System.out.println("Hourly pay rate: $" + tl.getHourlyPayRate());
		System.out.println("Monthly bonus amount: $" + tl.getMonthlyBonusAmount());
		System.out.println("Required training hours: " + tl.getRequiredTrainingHours());
		System.out.println("Attended training hours: " + tl.getAttendedTrainingHours());
	}
}