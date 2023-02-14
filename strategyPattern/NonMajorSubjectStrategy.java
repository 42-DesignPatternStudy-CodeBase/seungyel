package strategyPattern;

public class NonMajorSubjectStrategy implements GradeStrategy {
    @Override
	public String evaluateGrade(int score) {
		if (score >= 90) {
			return "A";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 70) {
			return "C";
		} else if (score >= 55) {
			return "D";
		} else {
			return "F";
		}
	}
}
