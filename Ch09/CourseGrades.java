public class CourseGrades {

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
}