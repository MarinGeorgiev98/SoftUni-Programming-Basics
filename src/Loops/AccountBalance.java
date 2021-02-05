import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double sum = 0;
        while (n > 0) {
            double num = Double.parseDouble(scan.nextLine());
            if (num <0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + num;
            System.out.printf("Increase is: %.2f%n", num);
            n--;
            }
        System.out.printf("Total: %.2f", sum);
    }
}