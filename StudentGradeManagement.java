import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3];
    double average;
    char grade;

    // Method to input student details
    void inputDetails(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); // consume leftover newline
    }

    // Method to calculate average and grade
    void calculateGrade() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }

        average = sum / 3.0;

        if (average >= 80) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    // Method to display report
    void displayReport() {
        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.inputDetails(sc);
        student.calculateGrade();
        student.displayReport();

        sc.close();
    }
}
