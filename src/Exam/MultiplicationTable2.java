import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());
        for (int i = multiplier; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
        if (multiplier > 10) {
            System.out.printf("%d X %d = %d%n", n, multiplier, n * multiplier);
        }
    }
}