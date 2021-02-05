import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String presentationName = scan.nextLine();
        double grade = 0;
        int counter = 0;
        while (!presentationName.equals("Finish")) {
            double tempgrade = 0;
            for (int i = 0; i < number ; i++) {
                double n = Double.parseDouble(scan.nextLine());
                tempgrade = tempgrade + n;
                grade = grade + n;
                counter++;
            }
            tempgrade = tempgrade / number;
            System.out.printf("%s - %.2f.%n", presentationName, tempgrade);
            presentationName = scan.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", grade / counter);
    }
}