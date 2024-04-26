import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        Medication med1 = new Medication("Paracetamol", 5.99, true);
        Medication med2 = new Medication("Aspirin", 3.49, false);

        pharmacy.save(med1);
        pharmacy.save(med2);

        System.out.println("Number of medications in the pharmacy: " + pharmacy.getCount());

        pharmacy.printAllMedications();

        Medication foundMed = pharmacy.find("Paracetamol");
        if (foundMed != null) {
            System.out.println("Found medication: " + foundMed.getName());
        } else {
            System.out.println("Medication not found.");
        }

        pharmacy.delete("Paracetamol");

        pharmacy.printAllMedications();









//
//        School school1 = new School();
//        school1.addStudent(new Student(1001, "Doe", "John"));
//        school1.addStudent(new Student(1002, "Johnson", "Alice"));
//        school1.addStudent(new Student(1003, "Lay", "Jay"));
//
//        List<Student> students = school1.getStudentList();
//
//        school1.printAllStudents();
//
//        System.out.println("findStudentByID=1011..." + school1.findStudentByID(1001));
//
//        school1.removeStudent(students.get(0));
//
//        school1.printAllStudents();


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
