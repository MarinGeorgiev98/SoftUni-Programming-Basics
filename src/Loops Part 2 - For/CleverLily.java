import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        double money = 0;
        double toyPriceSum = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + i * 5 - 1;
            } else {
                toyPriceSum = toyPriceSum + toyPrice;
            }
        }
        double sum = money + toyPriceSum;
        if (sum >= price) {
            System.out.printf("Yes! %.2f", sum - price);
            }
        else {
            System.out.printf("No! %.2f", Math.abs(price - sum));
        }
    }
}