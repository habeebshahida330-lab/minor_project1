
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = null;
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Enter Marks");
            System.out.println("4. Calculate Total");
            System.out.println("5. Calculate Average");
            System.out.println("6. Calculate Grade");
            System.out.println("7. Pass / Fail");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    student = new Student(id, name, dept);

                    System.out.println("Student added successfully");
                    break;

                case 2:
                    if (student == null) {
                        System.out.println("Please add a student first");
                    } else {
                        student.displayDetails();
                    }
                    break;

                case 3:
                    if (student == null) {
                        System.out.println("Please add a student first");
                    } else {
                        System.out.print("Enter Subject 1 Marks: ");
                        int m1 = sc.nextInt();

                        System.out.print("Enter Subject 2 Marks: ");
                        int m2 = sc.nextInt();

                        System.out.print("Enter Subject 3 Marks: ");
                        int m3 = sc.nextInt();

                        if (m1 < 0 || m1 > 100 ||
                            m2 < 0 || m2 > 100 ||
                            m3 < 0 || m3 > 100) {

                            System.out.println("Marks must be between 0 and 100");

                        } else {
                            student.enterMarks(m1, m2, m3);
                            System.out.println("Marks entered successfully");
                        }
                    }
                    break;

                case 4:
                    if (student == null) {
                        System.out.println("Please add a student first");
                    } else {
                        System.out.println("Total Marks: " +
                                student.calculateTotal());
                    }
                    break;

                case 5:
                    if (student == null) {
                        System.out.println("Please add a student first");
                    } else {
                        System.out.println("Average: " +
                                student.calculateAverage());
                    }
                    break;

                case 6:
                    if (student == null) {
                        System.out.println("Please add a student first");
                    } else {
                        System.out.println("Grade: " +
                                student.calculateGrade());
                    }
                    break;

                case 7:
                    if (student == null) {
                        System.out.println("Please add a student first");
                    } else {
                        System.out.println("Result: " +
                                student.getResult());
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 8);

        sc.close();
    }
}
