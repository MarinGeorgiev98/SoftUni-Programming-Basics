import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int counter = 1;
        double avgGrade = 0;
        while (counter <=12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                avgGrade = avgGrade + grade;
                counter++;
            }
            }
        System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade / counter);
        }
    }