public class Challenge01 {

	public static void main(String[] args) {
		String str = "gravity";
		backward(str);
	}
	
	public static void backward(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}