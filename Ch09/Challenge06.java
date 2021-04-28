public class Challenge06 {

	public static void main(String[] args) {
		GradedActivity ga = new GradedActivity();
		ga.setScore(68);
		PassFailExam psf = new PassFailExam(10, 4, 70);
		Essay e = new Essay(14, 23, 18, 30);
		e.setScore();
		FinalExam fe = new FinalExam(50, 14);
		CourseGrades2 cg = new CourseGrades2();
		cg.setLab(ga);
		cg.setPassFailExam(psf);
		cg.setEssay(e);
		cg.setFinalExam(fe);
		System.out.println(cg);
		System.out.println("Average: " + cg.getAverage());
		System.out.println("Highest: " + cg.getHighest());
		System.out.println("Lowest: " + cg.getLowest());
	}
}