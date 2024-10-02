# IIITD Course Registration System v2.0

## Overview
This assignment is a terminal-based IIITD Course Registration System developed as part of the. The application allows three types of users—**Students**, **Professors**, and **Administrators**—to perform specific functions related to course registration, management, and student records.

## How to Run the Application
1. **Download the Project:**
    - Download and unzip the project directory.

2. **Compile the Project:**
    - Navigate to the directory containing the `Main.java` file and run the following command:
      ```bash
      javac Main.java
      ```

3. **Run the Application:**
    - Once compiled, run the application using the command:
      ```bash
      java Main
      ```

4. **User Login:**
    -After entering the application, it presents users with a login screen where users can log in as a **Student**, **Professor**, or **Administrator**.

## Incorporation Of Different Features
### Feedback System Using Generic Programming
- **Feedback Class**: I created a feedback class first which can either accept an integer rating or a string description
- **Giving Feedback**: When logged in as a student, the user can select a course which he has completed
and give either a rating (1-10) or a textual feedback
- **Professor**: When logged in as a prof, the user can select a course he is teaching and view all the feedbacks
submitted by various students for that course
- **Note**: Feedbacks are anonymous

### New User Type : Teaching Assistant [TA]
- **Object Class**: Implemented .equals for comparing two strings
- **TA Class**: Extends the student class and thus functions exactly as a student, only difference is that a TA
can select a course he is an assistant for and view the students enrolled in that course and then assign them a grade
- **Note**: After assigning a grade that course is completed and moved from enrolledCourses for that student to finishedCourses array
- **Note**: After enrolledCourses is empty the admin can change a student's semester if he passed

### Improved Exception Handling
- **Invalid Course Registration**: If enrollment limit of a course is reached when a user registers for it, it throws a CourseFullException which is then caught in Main.java
- **Invalid Login**: Upon an Invalid Username or Password Main.java throws an InvalidLoginException which is then caught in Main.java itself
- **Course Drop Failure**: If a student attempts to drop a course after the deadline, a DropDeadlinePassedException is thrown
- **Note**: By default, there is no deadline for dropping a course (its start of next semester) but I've hardcoded one for a course called ADA and I've also hardcoded a student which has registered for that course so if he attempts to drop it an exception is raised.
- **Also Note**: I had to hardcode the deadlines since in the first assignment you guys said that deadlines are optional.

## Credits
Developed by Sanchay Singh [2023478].

