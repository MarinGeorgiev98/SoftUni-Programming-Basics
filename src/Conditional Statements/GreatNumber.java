import java.util.Scanner;
public class GreatNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        if (num1 > num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
