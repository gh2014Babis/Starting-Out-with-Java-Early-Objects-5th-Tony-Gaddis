public class DriverExam {
	
	private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 
	                                 'A', 'B', 'A', 'C', 'D', 
									 'B', 'C', 'D', 'A', 'D',
									 'C', 'C', 'B', 'D', 'A'};
									 
	private char[] studentAnswers;
	
	public DriverExam (char[] sa) {
		studentAnswers = new char[sa.length];
		for (int i = 0; i < sa.length; i++) {
			studentAnswers[i] = sa[i];
		}
	}
	
	public boolean passed() {
		int c = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (studentAnswers[i] == correctAnswers[i]) {
				c++;
			}
		}
		if (c >= 15)
			return true;
		return false;
	}
	
	public int totalCorrect() {
		int c = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (studentAnswers[i] == correctAnswers[i]) {
				c++;
			}
		}
		return c;
	}
	
	public int totalIncorrect() {
		/*
		int inc = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (studentAnswers[i] != correctAnswers[i]) {
				inc++;
			}
		}
		return inc;
		*/
		return correctAnswers.length - totalCorrect();
	}
	
	public int[] questionsMissed() {
		int[] missed = new int[20];
		int k = -1;
		for (int i = 0; i < correctAnswers.length; i++) {
			if (studentAnswers[i] != correctAnswers[i]) {
				k++;
				missed[k] = i + 1;
			}
		}
		int[] finalMissed = new int[k + 1];
		for (int i = 0; i <= k; i++)
			finalMissed[i] = missed[i];
		return finalMissed;
	}
}