import java.util.Scanner;
public class SumRecords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstPlayerSec = Integer.parseInt(scan.nextLine());
        int secondPlayerSec = Integer.parseInt(scan.nextLine());
        int thirdPlayerSec = Integer.parseInt(scan.nextLine());
        int totalSumSec = firstPlayerSec + secondPlayerSec + thirdPlayerSec;
        int minutes = totalSumSec / 60;
        int seconds = totalSumSec % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}