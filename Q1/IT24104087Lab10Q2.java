import java.util.Scanner;

public class IT24104087Lab10Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mark: ");
        int mark = scanner.nextInt();
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        assert (grade == getGrade(mark)) : "Incorrect Grade Assigned";
        System.out.println("Grade: " + grade);
    }

    private static char getGrade(int mark) {
        if (mark >= 75) return 'A';
        if (mark >= 60) return 'B';
        if (mark >= 50) return 'C';
        if (mark >= 40) return 'D';
        return 'F';
    }
}
