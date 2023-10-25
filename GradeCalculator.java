import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalsubjects;
        double totalmarks = 0;
        double averagepercentage;
        String grade;

        System.out.print("Enter the number of subjects: ");
        totalsubjects = scanner.nextInt();

        for (int i = 1; i <= totalsubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                return;
            }

            totalmarks += marks;
        }

        averagepercentage = (totalmarks / (totalsubjects * 100)) * 100;
        
        if (averagepercentage >= 90) {
            grade= "A+";
        } else if (averagepercentage >= 80) {
            grade= "A";
        } else if (averagepercentage >= 70) {
            grade= "B";
        } else if (averagepercentage >= 60) {
            grade= "C";
        } else if (averagepercentage >= 50) {
            grade= "D";
        } else {
            grade= "F";
        }
        System.out.println("Total marks: " + totalmarks);
        System.out.println("Average percentage: " + averagepercentage + "%");
        System.out.println("Grade: " + grade);

    }
}