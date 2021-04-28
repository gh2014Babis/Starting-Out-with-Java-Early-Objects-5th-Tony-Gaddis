public class Challenge02 {
	
	public static void main(String[] args) {
		ShiftSupervisor ss = new ShiftSupervisor("Babis", "123-A", "03/09/2020", 30000, 6000);
		System.out.println("Name: " + ss.getName());
		System.out.println("Employee number: " + ss.getEmployeeNumber());
		System.out.println("Hire date: " + ss.getHireDate());
		System.out.println("Annual salary: $" + ss.getAnnualSalary());
		System.out.println("Annual production bonus: $" + ss.getAnnualProductionBonus());
	}
}