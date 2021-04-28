
public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(1995, "VW");
		c.accelerate();
		c.accelerate();
		c.accelerate();
		c.accelerate();
		c.accelerate();
		System.out.println("Speed: " + c.getSpeed());
		c.brake();
		c.brake();
		c.brake();
		c.brake();
		c.brake();
		System.out.println("Speed: " + c.getSpeed());
	}
}
