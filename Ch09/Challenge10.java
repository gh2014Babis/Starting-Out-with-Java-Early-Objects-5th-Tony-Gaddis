
public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship[] ships = new Ship[3];
		ships[0] = new Ship("Babis", "1980");
		ships[1] = new CruiseShip("Angel", "1981", 3);
		ships[2] = new CargoShip("Christos", "2018", 15000);
		for (int i = 0; i < ships.length; i++) {
			System.out.println(ships[i]);
		}
	}
}
