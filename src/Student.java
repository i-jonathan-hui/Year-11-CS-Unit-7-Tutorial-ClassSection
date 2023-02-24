public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        this.id = studentCount++;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public int getYearLevel() { return yearLevel; }
    public int getStudentCount() { return studentCount; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }

    public void setId(int id) {
        this.id = id;
    }
    public boolean equals(Student student) {
        int cnt = 0;
        if (id == student.getId()) cnt++;
        if (firstName == student.getFirstName()) cnt++;
        if (lastName == student.getLastName()) cnt++;
        if (age == student.getAge()) cnt++;
        if (yearLevel == student.getYearLevel()) cnt++;
        return (cnt == 5);
    }

   public String toString() {
       return "Student{id=" + id + ", firstName=\'" + firstName + "\', lastName=\'" + lastName + "\', age=" + age + "}";
   }
}
