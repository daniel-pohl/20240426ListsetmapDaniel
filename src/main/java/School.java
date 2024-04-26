import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> studentList = new ArrayList<>();

    public School() {

    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void printAllStudents(){
        System.out.println("List of Students:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
    public Student findStudentByID(int studentID) {
        for (Student s : studentList) {
            if (s.getStudentID() == studentID) {
                return s;
            }
        }
        return null;
    }
    public void removeStudent(Student student) {
        studentList.remove(student);
    }
}
