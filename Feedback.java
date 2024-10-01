public class Feedback<T> {

    private String courseCode;
    private T feedback; // int or string

    public Feedback(String courseCode, T feedback) {
        this.courseCode = courseCode;
        this.feedback = feedback;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public T getFeedback() {
        return feedback;
    }

}