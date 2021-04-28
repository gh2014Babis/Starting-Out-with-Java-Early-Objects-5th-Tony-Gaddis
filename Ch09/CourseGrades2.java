public class CourseGrades2 implements Analyzable {

	private GradedActivity[] grades = new GradedActivity[4];
	
	public void setLab(GradedActivity obj) {
		grades[0] = obj;
	}
	
	public void setPassFailExam(PassFailExam obj) {
		grades[1] = obj;
	}
	
	public void setEssay(Essay obj) {
		grades[2] = obj;
	}
	
	public void setFinalExam(FinalExam obj) {
		grades[3] = obj;
	}
	
	public String toString() {
		return "Lab score: " + grades[0].getScore() + ", Grade: " + grades[0].getGrade() + "\n"
		       + "Pass/Fail exam score: " + grades[1].getScore() + ", Grade: " + grades[1].getGrade() + "\n"
			   + "Essay score: " + grades[2].getScore() + ", Grade: " + grades[2].getGrade() + "\n"
			   + "Final exam score: " + grades[3].getScore() + ", Grade: " + grades[3].getGrade();
	}
	
	public double getAverage() {
		return (grades[0].getScore() + grades[1].getScore() + grades[2].getScore() + grades[3].getScore()) / 4;
	}
	
	public GradedActivity getHighest() {
		GradedActivity highest = grades[0];
		double maxScore = grades[0].getScore();
		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() > maxScore) {
				maxScore = grades[i].getScore();
				highest = grades[i];
			}
		}
		return highest;
	}
	
	public GradedActivity getLowest() {
		GradedActivity lowest = grades[0];
		double minScore = grades[0].getScore();
		for (int i = 1; i < grades.length; i++) {
			if (grades[i].getScore() < minScore) {
				minScore = grades[i].getScore();
				lowest = grades[i];
			}
		}
		return lowest;
	}
}