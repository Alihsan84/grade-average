import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;
        int totalGrade=0,totalCourse=0;
        double average;

        System.out.print("Enter your mark of the Mathematics: ");
        math = scanner.nextInt();
        if ((math >= 0) && (math <= 100)) {
            totalGrade+=math;
            totalCourse++;
        }

        System.out.print("Enter your mark of the Physics: ");
        physics = scanner.nextInt();
        if ((physics >= 0) && (physics <= 100)) {
            totalGrade+=physics;
            totalCourse++;
        }

        System.out.print("Enter your mark of the Turkish: ");
        turkish = scanner.nextInt();
        if ((turkish >= 0) && (turkish <= 100)) {
            totalGrade+=turkish;
            totalCourse++;
        }

        System.out.print("Enter your mark of the Chemistry: ");
        chemistry = scanner.nextInt();
        if ((chemistry >= 0) && (chemistry <= 100)) {
            totalGrade+=chemistry;
            totalCourse++;
        }

        System.out.print("Enter your mark of the Music: ");
        music = scanner.nextInt();
        if ((music >= 0) && (music <= 100)) {
            totalGrade+=music;
            totalCourse++;
        }

        average = (totalGrade / totalCourse);
        System.out.println("The average of the marks: " + average);
        if (average >= 55) {
            System.out.print("Congratulations! You passed the class.");
        } else {
            System.out.print("Sorry, you failed the class.");
        }
    }
}
