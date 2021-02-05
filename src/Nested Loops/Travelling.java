import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();
        int minBudget = Integer.parseInt(scan.nextLine());
        int lastSum = 0;
        while (!destination.equals("End")) {
            while (true) {
                int sum = Integer.parseInt(scan.nextLine());
                lastSum = lastSum + sum;
                if (lastSum >= minBudget) {
                    System.out.printf("Going to %s!%n", destination);
                    lastSum = 0;
                    break;
                }
            }
            destination = scan.nextLine();
            if (destination.equals("End")) {
                break;
            }
            minBudget = Integer.parseInt(scan.nextLine());
        }
    }
}