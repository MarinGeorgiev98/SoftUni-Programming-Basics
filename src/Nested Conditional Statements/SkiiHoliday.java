import java.util.Scanner;

public class SkiiHoliday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String roomType= scan.nextLine();
        String grade = scan.nextLine();
        int overnight = days - 1;
        double price = 0.0;
        if (roomType.equals("room for one person")) {
            price = overnight * 18;
        }
        if (roomType.equals("apartment")) {
            if (overnight < 10) {
                price = overnight * 25 * 0.7;
            }
            else if (overnight >= 10 && overnight <=15) {
                price = overnight * 25 * 0.65;
            }
            else if (overnight > 15) {
                price = overnight * 25 * 0.5;
            }
        }
        if (roomType.equals("president apartment")) {
            if (overnight < 10) {
                price = overnight * 35 * 0.9;
            }
            else if (overnight >= 10 && overnight <=15) {
                price = overnight * 35 * 0.85;
            }
            else if (overnight > 15) {
                price = overnight * 35 * 0.8;
            }
        }
        if (grade.equals("positive")) {
            price = price + price * 0.25;
        }
        else if (grade.equals("negative")) {
            price = price - price * 0.1;
        }
        System.out.printf("%.2f", price);
    }
}