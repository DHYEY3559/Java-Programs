import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    String department;
    int[] marks = new int[3];
    double percentage;

    // Constructor
    Student(String name, String department, int m1, int m2, int m3) {
        this.name = name;
        this.department = department;
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
        this.percentage = (m1 + m2 + m3) / 3.0;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("---------------------------------");
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Input details of 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Enter marks for 3 subjects: ");
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int m3 = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            students[i] = new Student(name, department, m1, m2, m3);
        }

        // Sorting students by percentage in descending order
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.percentage, s1.percentage));

        // Display sorted student details
        System.out.println("\nStudent Details (Sorted by Percentage in Descending Order):");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}
