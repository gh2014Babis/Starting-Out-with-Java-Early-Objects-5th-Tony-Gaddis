import java.io.IOException;

public class Challenge06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] numbers = {12, 56, 27, 83, 39, 70, 44, 8};
		FileArray.writeArray("Numbers.dat", numbers);
		FileArray.readArray("Numbers.dat", numbers);
	}
}
