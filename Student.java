public class Student {

    private int studentId;
    private String studentName;
    private String department;

    private int mark1;
    private int mark2;
    private int mark3;
    public void displayDetails() {
    System.out.println("Student ID: " + studentId);
    System.out.println("Name: " + studentName);
    System.out.println("Department: " + department);
}

    public Student(int studentId, String studentName,
                   String department) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        
    }

public void enterMarks(int m1, int m2, int m3) {
    mark1 = m1;
    mark2 = m2;
    mark3 = m3;
}

public int calculateTotal() {
    return mark1 + mark2 + mark3;
}

public double calculateAverage() {
    return calculateTotal() / 3.0;
}

public String calculateGrade() {

    double average = calculateAverage();

    if (average >= 90)
        return "A+";
    else if (average >= 80)
        return "A";
    else if (average >= 70)
        return "B";
    else if (average >= 60)
        return "C";
    else if (average >= 50)
        return "D";
    else
        return "Fail";
}
public String getResult() {

    if (calculateAverage() >= 50)
        return "PASS";
    else
        return "FAIL";
}
}
