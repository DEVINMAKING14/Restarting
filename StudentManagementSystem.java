import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayAll();
                case 3 -> searchStudent();
                case 4 -> calculateAverage();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        students.add(new Student(roll, name, marks));
        System.out.println("✅ Student added successfully!");
    }

    private static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            s.display();
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.println("✅ Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }

    private static void calculateAverage() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found.");
            return;
        }
        double sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        System.out.println("📊 Average Marks: " + (sum / students.size()));
    }
}
