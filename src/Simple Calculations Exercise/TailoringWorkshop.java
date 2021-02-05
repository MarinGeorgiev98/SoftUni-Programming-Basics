import java.util.Scanner;
public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tablesCnt = Integer.parseInt(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double coverArea = (length + 2 * 0.3) * (width + 2 * 0.3);
        double totalCoverArea = coverArea * tablesCnt;
        double squareArea = Math.pow(length / 2, 2);
        double totalSquareArea = squareArea * tablesCnt;
        double priceInUSD = totalCoverArea * 7 + totalSquareArea * 9;
        double priceInBGN = priceInUSD * 1.85;
        System.out.printf("%.2f USD %n", priceInUSD);
        System.out.printf("%.2f BGN", priceInBGN);
    }
}