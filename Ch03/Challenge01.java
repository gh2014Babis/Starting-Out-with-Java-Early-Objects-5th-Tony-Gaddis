
public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.setName("Susan Meyers");
		emp1.setIDNumber(47899);
		emp1.setDepartment("Accounting");
		emp1.setPosition("Vice President");
		emp2.setName("Mark Jones");
		emp2.setIDNumber(39119);
		emp2.setDepartment("IT");
		emp2.setPosition("Programmer");
		emp3.setName("Joy Rogers");
		emp3.setIDNumber(81774);
		emp3.setDepartment("Manufacturing");
		emp3.setPosition("Engineer");
		emp1.display();
		System.out.println("******************");
		emp2.display();
		System.out.println("******************");
		emp3.display();
	}
}
