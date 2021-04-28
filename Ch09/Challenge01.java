public class Challenge01 {
	
	public static void main(String[] args) {
		ProductionWorker pw = new ProductionWorker("Babis", "123-A", "03/09/2020", 1, 8);
		System.out.println("Name: " + pw.getName());
		System.out.println("Employee number: " + pw.getEmployeeNumber());
		System.out.println("Hire date: " + pw.getHireDate());
		System.out.println("Shift: " + pw.getShift());
		System.out.println("Hourly pay rate: $" + pw.getHourlyPayRate());
	}
}