import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TA  extends Student{
    private static final List<Course> coursesTA = new ArrayList<Course>();

    public TA(String email, String password, int semester) {
        super(email, password, semester,3);
    }

    @Override
    public int interfaceGUI(){
        int choice;
        while (true){
            printDashes();
            welcome();
            System.out.println("Press\n1.To View Available Courses\n2.To Register For Courses\n3.To View Schedule\n4.Track Academic Progress\n5.Drop Courses\n6.To Submit Complaints\n7.View Submitted Complaints\n8.Submit Feedback\n9.Manage Student Grades\n10.Logout");
            printDashes();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            printDashes();
            if(choice!=1 && choice!=2 && choice!=3 && choice!=4 && choice!=5 && choice!=6 && choice!=7 && choice!=8 && choice!=9 && choice!=10){
                System.out.println("Invalid choice");
                continue;
            }
            break;
        }
        return choice;
    }

    @Override
    public void addTAcourse(Course course){
        coursesTA.add(course);
    }

    @Override
    public List<Course> getCoursesTA(){
        return coursesTA;
    }
}
