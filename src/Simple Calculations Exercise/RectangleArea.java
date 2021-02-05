import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double sideX = Math.abs (x1 - x2);
        double sideY = Math.abs (y1 - y2);
        double area = sideX * sideY;
        double perimeter = (sideX + sideY) * 2;
        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}