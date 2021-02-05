import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double totalGrade = 0;
        int counter = 0;
        int expelCount = 0;
        boolean isExpelled = false;
        while (counter < 12 && expelCount <= 2) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4.00) {
                counter++;
                totalGrade = totalGrade + grade;
            }
            else {
                expelCount++;
            }
        }
        if (expelCount == 2) {
            isExpelled = true;
        }
        if (isExpelled) {
            System.out.printf("%s has been excluded at %d grade ", name, counter);
        }
        else {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalGrade / 12);
        }
    }
}