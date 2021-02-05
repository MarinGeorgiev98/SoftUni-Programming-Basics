import java.util.Scanner;
public class GodzillaAndKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scan.nextLine());
        int statistNum = Integer.parseInt(scan.nextLine());
        double statistClothes = Double.parseDouble(scan.nextLine());
        double statistClothesPrice = statistClothes * statistNum;
        double decorPrice = filmBudget * 0.1;
        if (statistNum >150){
            statistClothesPrice = statistClothesPrice * 0.9;
        }
        double decorPlusClothes = decorPrice + statistClothesPrice;
        if (decorPlusClothes > filmBudget) {
            double missingMoney = decorPlusClothes - filmBudget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", missingMoney);
        }
        else {
            double leftMoney = filmBudget - decorPlusClothes;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}