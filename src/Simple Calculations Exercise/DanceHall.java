import java.util.Scanner;
public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double wardropeSide = Double.parseDouble(scan.nextLine());
        double hallSize = (length * 100) * (width * 100);
        double wardropeSize = wardropeSide * 100 * wardropeSide * 100;
        double benchSize = hallSize / 10;
        double leftArea = hallSize - wardropeSize - benchSize;
        double dancerNum = (leftArea / (40 + 7000));
        System.out.printf("%.0f", Math.floor(dancerNum));
    }
}
