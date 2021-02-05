import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lowGrades = Integer.parseInt(scan.nextLine());
        boolean isFailed = false;
        int failedTimes = 0;
        double avgScore = 0;
        int taskNumber = 0;
        String lastProblem = "";
        while(failedTimes < lowGrades) {
            String taskName = scan.nextLine();
            if(taskName.equals("Enough")) {
                isFailed = true;
                break;
            }
            int grade = Integer.parseInt(scan.nextLine());
            avgScore = avgScore + grade;
            taskNumber = taskNumber + 1;
            lastProblem = taskName;
            if (grade <= 4) {
                failedTimes++;
            }
            }
        if (isFailed) {
            System.out.printf("Average score: %.2f%n", avgScore / taskNumber);
            System.out.printf("Number of problems: %d%n", taskNumber);
            System.out.printf("Last problem: %s", lastProblem);
        }
        else {
            System.out.printf("You need a break, %d poor grades.", failedTimes);
        }
    }
}