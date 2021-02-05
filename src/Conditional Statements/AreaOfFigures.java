import java.util.Scanner;
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area = 0.0;
        switch (figure) {
            case "square":
                double squareSide = Double.parseDouble(scan.nextLine());
                area = squareSide * squareSide;
                break;
            case "rectangle":
                double sideA = Double.parseDouble(scan.nextLine());
                double sideB = Double.parseDouble(scan.nextLine());
                area = sideA * sideB;
                break;
            case "circle":
                double r = Double.parseDouble(scan.nextLine());
                area = Math.PI * r * r;
                break;
            case "triangle":
                double sideTriangle = Double.parseDouble(scan.nextLine());
                double h = Double.parseDouble(scan.nextLine());
                area = (sideTriangle * h) / 2;
                break;
        }
        System.out.printf("%.3f", area);
    }
}