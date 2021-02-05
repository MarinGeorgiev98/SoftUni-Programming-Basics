import java.util.Scanner;
public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialPoints = Integer.parseInt(scan.nextLine());
        double bonus = 0;
        if (initialPoints <= 100) {
            bonus = 5;
            }
        else if (initialPoints > 1000) {
            bonus = initialPoints * 0.1;
        }
        else if (initialPoints >100) {
            bonus = initialPoints * 0.2;
        }
        if (initialPoints % 2 == 0){
            bonus = bonus + 1;
        }
        if (initialPoints % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(initialPoints + bonus);
    }
}