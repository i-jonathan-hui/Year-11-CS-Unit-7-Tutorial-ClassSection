import java.util.*;
public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList<Student>();;
    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject() { return subject; }
    public int getCapacity() { return capacity; }
    public int getYearLevel() { return yearLevel; }
    public ArrayList<Student> getStudents() { return students; }

    public void setSubject(String subject) { this.subject = subject; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }
    public void addStudent(Student student) {
        for (int i=0; i<students.size(); i++) {
            if (students.get(i).equals(student)) { return; }
        }
        if (student.getYearLevel() != yearLevel) { return; }
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
    public boolean isStudentEnrolled(Student student) {
        for (int i=0; i<students.size(); i++) {
            if (students.get(i).equals(student)) return true;
        }
        return false;
    }

    public String toString() {
        return "ClassSection{subject=\'" + subject + "\', capacity=" + capacity + ", students=" + students + "}";
    }
}
