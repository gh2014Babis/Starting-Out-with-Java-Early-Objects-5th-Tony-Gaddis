import java.util.ArrayList;

public class GradeBook {
	
	private ArrayList<String> names;
	private char[] grades;
	private double[] scores1;
	private double[] scores2;
	private double[] scores3;
	private double[] scores4;
	private double[] scores5;
	
	public GradeBook(ArrayList<String> names, char[] grades, double[] scores1, double[] scores2, double[] scores3, double[] scores4, double[] scores5) {
		this.names = new ArrayList<String>();
		for (int i = 0; i < names.size(); i++) {
			this.names.add(names.get(i));
		}
		this.grades = new char[grades.length];
		this.scores1 = new double[scores1.length];
		this.scores2 = new double[scores2.length];
		this.scores3 = new double[scores3.length];
		this.scores4 = new double[scores4.length];
		this.scores5 = new double[scores5.length];
		for (int i = 0; i < 5; i++) {
			this.grades[i] = grades[i];
		}
		for (int i = 0; i < 4; i++) {
			this.scores1[i] = scores1[i];
			this.scores2[i] = scores2[i];
			this.scores3[i] = scores3[i];
			this.scores4[i] = scores4[i];
			this.scores5[i] = scores5[i];
		}
	}
	
	public String getName(int idx) {
		return names.get(idx);
	}
	
	public double getAvg(int idx) {
		double[] s;
		if (idx == 0)
			s = scores1;
		else if (idx == 1)
			s = scores2;
		else if (idx == 2)
			s = scores3;
		else if (idx == 3)
			s = scores4;
		else
			s = scores5;
		double sum = 0;
		for (int i = 0; i < 4; i++)
			sum += s[i];
		return sum / 4;
	}
	
	public char getGrade(int idx) {
		double avg = getAvg(idx);
		char grade;
		if (avg <= 59)
			grade = 'F';
		else if (avg <= 69)
			grade = 'D';
		else if (avg <= 79)
			grade = 'C';
		else if (avg <= 89)
			grade = 'B';
		else
			grade = 'A';
		return grade;
	}
	
	public double getMinScore(int idx) {
		double[] s;
		if (idx == 0)
			s = scores1;
		else if (idx == 1)
			s = scores2;
		else if (idx == 2)
			s = scores3;
		else if (idx == 3)
			s = scores4;
		else
			s = scores5;
		double min = s[0];
		for (int i = 1; i < s.length; i++) {
			if (s[i] < min)
				min = s[i];
		}
		return min;
	}
}
