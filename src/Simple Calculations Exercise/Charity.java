import java.util.Scanner;
public class Charity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysOfCampaign = Integer.parseInt(scan.nextLine());
        int bakersCnt = Integer. parseInt(scan.nextLine());
        int cakesCnt = Integer.parseInt(scan.nextLine());
        int wafflesCnt = Integer.parseInt(scan.nextLine());
        int pancakesCnt = Integer.parseInt(scan.nextLine());
        double pricePerBakerPerDay = cakesCnt * 45 + wafflesCnt * 5.8 + pancakesCnt * 3.2;
        double pricePerDay = pricePerBakerPerDay * bakersCnt;
        double totalPrice = pricePerDay * daysOfCampaign;
        double tax = totalPrice / 8;
        double finalPrice = totalPrice - tax;
        System.out.printf("%.2f", finalPrice);
    }
}