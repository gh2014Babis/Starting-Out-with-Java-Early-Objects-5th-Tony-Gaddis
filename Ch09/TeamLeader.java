public class TeamLeader extends ProductionWorker {

	private double monthlyBonusAmount;
	private int requiredTrainingHours;
	private int attendedTrainingHours;
	
	public TeamLeader(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate, double monthlyBonusAmount, int requiredTrainingHours, int attendedTrainingHours) {
		super(name, employeeNumber, hireDate, shift, hourlyPayRate);
		this.monthlyBonusAmount = monthlyBonusAmount;
		this.requiredTrainingHours = requiredTrainingHours;
		this.attendedTrainingHours = attendedTrainingHours;
	}
	
	public void setMonthlyBonusAmount(double monthlyBonusAmount) {
		this.monthlyBonusAmount = monthlyBonusAmount;
	}
	
	public void setRequiredTrainingHours(int requiredTrainingHours) {
		this.requiredTrainingHours = requiredTrainingHours;
	}
	
	public void setAttendedTrainingHours(int attendedTrainingHours) {
		this.attendedTrainingHours = attendedTrainingHours;
	}
	
	public double getMonthlyBonusAmount() {
		return monthlyBonusAmount;
	}
	
	public int getRequiredTrainingHours() {
		return requiredTrainingHours;
	}
	
	public int getAttendedTrainingHours() {
		return attendedTrainingHours;
	}
}	 