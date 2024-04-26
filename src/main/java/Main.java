import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School school1 = new School();
        school1.addStudent(new Student(1001, "Doe", "John"));
        school1.addStudent(new Student(1002, "Johnson", "Alice"));
        school1.addStudent(new Student(1003, "Lay", "Jay"));

        List<Student> students = school1.getStudentList();

        school1.printAllStudents();

        System.out.println("findStudentByID=1011..." + school1.findStudentByID(1001));

        school1.removeStudent(students.get(0));

        school1.printAllStudents();


//        List<Student> studentList = new ArrayList<>();
//
//        studentList.add(new Student(1001, "Doe", "John"));
//        studentList.add(new Student(1002, "Smith", "Jane"));
//
//        Student firstStudent = studentList.get(0);
//
//        System.out.println("First Name: " + firstStudent.getFirstName());
//        System.out.println("Last Name: " + firstStudent.getLastName());
//        System.out.println("Student ID: " + firstStudent.getStudentID());





    }
}
