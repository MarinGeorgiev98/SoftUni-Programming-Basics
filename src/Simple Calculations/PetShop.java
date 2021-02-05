import java.util.Scanner;
public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogCount = Integer.parseInt(scan.nextLine());
        int otherAnimals = Integer.parseInt(scan.nextLine());
        double totalSum = dogCount * 2.5 + otherAnimals * 4;
        System.out.printf("%.2f lv.", totalSum);
    }
}
