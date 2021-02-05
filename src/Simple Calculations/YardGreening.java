import java.util.Scanner;
public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m = Double.parseDouble(scan.nextLine());
        double YardGreening = m * 7.61;
        double discount = YardGreening * 0.18;
        double FinalPrice = YardGreening - discount;
        System.out.printf("The final price is: %.2f lv.\n", FinalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
