package strategyPattern;

import java.util.ArrayList;
import javax.security.auth.Subject;

public class Student {
    int studentID;
    String studentName; 
    ArrayList<Subject> subjectList;
    public static final int BASIC = 0; 
    public static final int MAJOR = 1;

    public Student(int studentID, String studentName){ 
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>(); 
    }

    public void addSubject(String name, int score, boolean majorCode){ 
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjectList.add(subject);
    }
}
