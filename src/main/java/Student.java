public class Student {

    int studentID;
    String firstName;
    String lastName;

    public Student(int studentID, String lastName, String firstName) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentId(int studentId) {
        this.studentID = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + getStudentID() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
