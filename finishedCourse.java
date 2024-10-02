public class finishedCourse extends Course{
    private final int grade;
    
    public finishedCourse(String courseCode, String courseName, String professor, String[] prerequisites, String[] timings,int semester,int credits,String location,int lim,int grade) {
        super(courseCode,courseName, professor, prerequisites, timings,semester,credits,location,lim);
        this.grade = grade;
    }

    public finishedCourse(Course course,int grade){
        super(course.getCourseCode(), course.getCourseName(), course.getInstructor(), course.getPrerequisites(), course.getTimings(), course.getSemester(), course.getCredits(),course.getLocation(), course.getEnrollmentLimit());
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
