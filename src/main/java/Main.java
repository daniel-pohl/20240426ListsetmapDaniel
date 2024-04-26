import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School school1 = new School();
        school1.addStudent(new Student(1001, "Doe", "John"));
        school1.addStudent(new Student(1002, "Johnson", "Alice"));
        school1.addStudent(new Student(1003, "Lay", "Jay"));
        school1.addStudent(new Student(1004, "Zoe", "Zmmm"));
        school1.addStudent(new Student(1005, "Koi", "Kane"));

        List<Student> students = school1.getStudentList();

        school1.printAllStudents();

        System.out.println(school1.findStudentByID(1001));

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





//        List<String> names = new ArrayList<>();
//
//        names.add("Alice");
//        names.add("Bob");
//        names.add("Cjkt");
//
//        names.remove("Alice");
//
//        names.add(1, "Charlie");
//
//        int size = names.size();
//        System.out.println(size);
//        String firstElement = names.get(0);
//        System.out.println("Das ist das firstElement " + firstElement + ".");
//        System.out.println("Das ist das firstElement \"" + firstElement + "\".");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        //Interface List
//
//        ArrayList<String> names2 = new ArrayList<>(); // not recommended!
//
//        List<Object> items1 = new ArrayList<>(); // best practice to define it like this once!
//        List<Object> items2 = new LinkedList<>(); // then we can simply use it like this later!


    }
}
