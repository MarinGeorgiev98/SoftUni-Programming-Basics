import java.util.Scanner;
public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scan.nextLine());
        double beerAmount = Double.parseDouble(scan.nextLine());
        double wineAmount = Double.parseDouble(scan.nextLine());
        double brandyAmount = Double.parseDouble(scan.nextLine());
        double whiskeyAmount = Double.parseDouble(scan.nextLine());
        double brandyPrice = whiskeyPrice * 0.5;
        double winePrice = brandyPrice - (brandyPrice * 0.4);
        double beerPrice = brandyPrice - (brandyPrice * 0.8);
        double finalPriceWhiskey = whiskeyPrice * whiskeyAmount;
        double finalPriceBeer = beerPrice * beerAmount;
        double finalPriceWine = winePrice * wineAmount;
        double finalPriceBrandy = brandyPrice * brandyAmount;
        double finalPrice = finalPriceBeer + finalPriceBrandy + finalPriceWhiskey + finalPriceWine;
        System.out.printf("%.2f", finalPrice);
    }
}
