package strategyPattern;

public class MajorSubjectStrategy implements GradeStrategy {
    @Override
    public String evaluateGrade(int score) {
        if (score >= 95 && score <= 100) {
            return "S";
        } else if (score >= 90 && score <= 94) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else {
            return "F";
        }
    }
}
