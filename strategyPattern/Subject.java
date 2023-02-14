package strategyPattern;

public class Subject {

    private String name;
    private int scorePoint;
    private boolean majorCode;
    private GradeStrategy gradeStrategy;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScorePoint() {
        return scorePoint;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
    public boolean isMajorCode() {
        return majorCode;
    }
    public void setMajorCode(boolean majorCode) {
        this.majorCode = majorCode;
        if (majorCode == true) {
            this.gradeStrategy = new MajorSubjectStrategy();
        } else {
            this.gradeStrategy = new NonMajorSubjectStrategy();
        }
    }
    public String getGrade() {
        return gradeStrategy.evaluateGrade(this.scorePoint);
    }
}
