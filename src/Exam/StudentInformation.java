import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double avgGrade = Double.parseDouble(scan.nextLine());
        String all = String.format("Name: %s, Age: %d, Grade: %.2f",
                name, age, avgGrade);
        System.out.println(all);
    }
}