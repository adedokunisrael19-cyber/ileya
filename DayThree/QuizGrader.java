import java.util.Scanner;

public class QuizGrader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of quizzes: ");
        int quizzes = input.nextInt();

        int[][] scores = new int[students][quizzes];

        // Collect scores
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));

            for (int j = 0; j < quizzes; j++) {
                System.out.print("Quiz " + (j + 1) + ": ");
                scores[i][j] = input.nextInt();
            }
        }

        // Print scores
        System.out.println("\nSCORES REPORT");

        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < quizzes; j++) {
                System.out.print(scores[i][j] + " ");
            }

            System.out.println();
        }

        input.close();
    }
}
