import javax.swing.*;
import java.util.Scanner;
public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Пъзел - 2.60 лв.
        // Говореща кукла - 3 лв.
        // Плюшено мече - 4.10 лв.
        // Миньон - 8.20 лв.
        // Камионче - 2 лв.
        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzleNumber = Integer.parseInt(scan.nextLine());
        int talkingDoll = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());
        double puzzlePrice = puzzleNumber * 2.60;
        double talkingDollPrice = talkingDoll * 3;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;
        double orderPrice = puzzlePrice + talkingDollPrice + bearsPrice + minionsPrice + trucksPrice;
        int ToysCnt = puzzleNumber + talkingDoll + bears + minions + trucks;
        double discount = 0.0;
        if (ToysCnt >=50) {
            discount = orderPrice * 0.25;
        }
        double totalPrice = orderPrice - discount;
        totalPrice = totalPrice - (totalPrice * 0.10);
        if (excursionPrice <= totalPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - excursionPrice);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalPrice);
        }
    }
}
