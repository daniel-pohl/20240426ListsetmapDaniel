import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> studentList;

    public School() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void printAllStudents(){
        System.out.println("List of Students:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() +
                    ", Student ID: " + student.getStudentID());
        }
    }
    public Student findStudentByID(int studentID) {
        for (Student student : studentList) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }
    public void removeStudent(Student student) {
        studentList.remove(student);
    }
}
