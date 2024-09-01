import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;
    String grade;
    String mobileNo;

    public Student(String name, int rollNo, String course, String grade, String mobileNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.grade = grade;
        this.mobileNo = mobileNo;
    }
}

public class StudentDatabase {
    static LinkedList<Student> students = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter course: ");
        String course = scanner.next();
        System.out.print("Enter grade: ");
        String grade = scanner.next();
        System.out.print("Enter mobile number: ");
        String mobileNo = scanner.next();

        Student student = new Student(name, rollNo, course, grade, mobileNo);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter roll number to search: ");
        int rollNo = scanner.nextInt();

        for (Student student : students) {
            if (student.rollNo == rollNo) {
                System.out.println("Name: " + student.name);
                System.out.println("Roll Number: " + student.rollNo);
                System.out.println("Course: " + student.course);
                System.out.println("Grade: " + student.grade);
                System.out.println("Mobile Number: " + student.mobileNo);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNo);
            System.out.println("Course: " + student.course);
            System.out.println("Grade: " + student.grade);
            System.out.println("Mobile Number: " + student.mobileNo);
            System.out.println();
        }
    }
}
