import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        boolean isTrue = false;
            while (!isTrue) {
                if (num % 2 == 1) {
                    System.out.println("Please write an even number.");
                } else {
                    isTrue = true;
                    break;
                }
                num = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(num));
    }
}