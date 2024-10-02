import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Course {
    private final String courseCode;
    private final String courseName;
    private String professor;
    private String[] prerequisites;
    private String[] timings; // (length should be 5, in case no class on a day that index of array should be empty) for every day mon,tue etc
    private final int semester;
    private int credits;
    private String location;
    private int enrollmentLimit;
    private int enrolled = 0;

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Date dropDeadline;

    public Course(String courseCode, String courseName, String professor, String[] prerequisites, String[] timings,int semester,int credits, String location,int enrollmentLimit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.professor = professor;
        this.prerequisites = prerequisites;
        this.timings = timings;
        this.semester = semester;
        this.credits = credits;
        this.location = location;
        this.enrollmentLimit = enrollmentLimit;
        this.setDropDeadline("2025-01-01");
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return professor;
    }

    public String[] getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String[] getTimings() {
        return timings;
    }

    public void setTimings(String[] timings) {
        this.timings = timings;
    }

    public int getSemester() {
        return semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits=credits;
    }

    public String getLocation() {
        return location;
    }

    public int getEnrollmentLimit() {
        return enrollmentLimit;
    }

    public int getEnrolled(){
        return enrolled;
    }

    public void enroll(){
        enrolled++;
    }

    public void unEnroll(){
        if(enrolled>0){
            enrolled--;
        }
    }

    public void setDropDeadline(String date) {
        try {
            dropDeadline = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public Date getDropDeadline(){
        return dropDeadline;
    }
}

