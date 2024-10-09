package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int TotalSub = scanner.nextInt();

       int[] marks = new int[TotalSub];
        int TotalMarks = 0;

        for (int i = 0; i < TotalSub; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            TotalMarks += marks[i];
        }

        double averagePercentage = (double) TotalMarks / TotalSub;


        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("----------------------------");
        System.out.println("Total Marks: " + TotalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
