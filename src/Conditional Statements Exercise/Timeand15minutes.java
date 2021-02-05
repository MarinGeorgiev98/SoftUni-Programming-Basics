import java.util.Scanner;
public class Timeand15minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int timeInMinutes = hour * 60 + minutes;
        int timeInMinutesPlusMin = timeInMinutes + 15;
        int totalHour = timeInMinutesPlusMin / 60;
        int totalMin = timeInMinutesPlusMin % 60;
        if (totalHour >=24)
        {
            totalHour = 0;
        }
        if (totalMin < 10) {
            System.out.printf("%d:0%d", totalHour, totalMin);
        }
        else {
            System.out.printf("%d:%d", totalHour, totalMin);
        }
    }
}