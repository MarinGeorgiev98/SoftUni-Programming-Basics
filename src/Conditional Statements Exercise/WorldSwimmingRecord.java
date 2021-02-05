import java.util.Scanner;
public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double oneMeterSec = Double.parseDouble(scan.nextLine());
        double distanceSlowingTimes = Math.floor((distanceInMeters / 15));
        double distanceSlowing = distanceSlowingTimes * 12.5;
        double totalSec = distanceInMeters * oneMeterSec + distanceSlowing;
        if (totalSec < recordInSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSec);
        }
        else {
            double seconds = totalSec - recordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", seconds);
        }
    }
}