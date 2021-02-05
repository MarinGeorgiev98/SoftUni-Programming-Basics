import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyForvacation = Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());
        int daysOfSpending = 0;
        int daysCounter = 0;
        while (money < moneyForvacation && daysOfSpending < 5) {
            String action = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            daysCounter = daysCounter + 1;
            if (action.equals("spend")) {
                money = money - sum;
                if (money < 0) {
                    money = 0;
                }
                daysOfSpending++;
            }
            else if (action.equals("save")) {
                money = money + sum;
                daysOfSpending = 0;
            }
        }
        if (daysOfSpending ==5) {
            System.out.printf("You can't save the money.%n");
            System.out.println(daysCounter);
        }
        else {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}