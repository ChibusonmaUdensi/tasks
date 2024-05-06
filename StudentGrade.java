import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of students and subjects
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();


	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved Successfully");


        // Create a 2D ArrayList to store the grades
        ArrayList<ArrayList<Integer>> grades = new ArrayList<>();

        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            ArrayList<Integer> studentGrades = new ArrayList<>();
            System.out.println("Entering score for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter score for Subject " + (j + 1) + ": ");
                int grade = scanner.nextInt();
                studentGrades.add(grade);
            }
            grades.add(studentGrades);
        }


System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");



System.out.println("==========================================================");
 
        System.out.println("\nGrades Table:");
        System.out.print("Student\t");
        for (int subjectNum = 1; subjectNum <= numSubjects; subjectNum++) {
            System.out.print("Subject " + subjectNum + "\t");
        }
        System.out.println("Average");

        for (int studentNum = 0; studentNum < numStudents; studentNum++) {
            int total = 0;
            System.out.print("Student " + (studentNum + 1) + "\t");
            for (int subjectNum = 0; subjectNum < numSubjects; subjectNum++) {
                int grade = grades.get(studentNum).get(subjectNum);
                total += grade;
                System.out.print(grade + "\t");
            }
            double average = (double) total / numSubjects;
		
		
            System.out.printf("%.2f%n", average);
        }


        System.out.println("\nAverage Score for Each Subject:");
        for (int subjectNum = 0; subjectNum < numSubjects; subjectNum++) {
            int subjectTotal = 0;
            for (int studentNum = 0; studentNum < numStudents; studentNum++) {
                subjectTotal += grades.get(studentNum).get(subjectNum);
            }
            double subjectAverage = (double) subjectTotal / numStudents;
            System.out.printf("Subject %d: %.2f%n", (subjectNum + 1), subjectAverage);
        }

       
    }
}

