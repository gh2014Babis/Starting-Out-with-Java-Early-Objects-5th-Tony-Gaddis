
public class Challenge10 {
	
	public static void main(String[] args) {
		try {
			ProductionWorker pw = new ProductionWorker("Babis", "1000", "03/09/2020", 1, -8);
			System.out.println("Name: " + pw.getName());
			System.out.println("Employee number: " + pw.getEmployeeNumber());
			System.out.println("Hire date: " + pw.getHireDate());
			System.out.println("Shift: " + pw.getShift());
			System.out.println("Hourly pay rate: $" + pw.getHourlyPayRate());
		} catch (InvalidEmployeeNumber e) {
			System.out.println(e.getMessage());
		} catch (InvalidShift e) {
			System.out.println(e.getMessage());
		} catch (InvalidPayRate e) {
			System.out.println(e.getMessage());
		}
	}
}
