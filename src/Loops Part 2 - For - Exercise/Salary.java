import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        int fineSum = 0;
        boolean isNotEnough = false;
        for (int i = 0; i < n; i++) {
            String siteName = scan.nextLine();
            if (siteName.equals("Facebook")) {
                fineSum = fineSum + 150;
            }
            if (salary <= fineSum) {
            isNotEnough = true;
            break; }
            if(siteName.equals("Instagram")) {
                fineSum = fineSum + 100;
            }
            if (salary <= fineSum) {
                isNotEnough = true;
                break; }
            if (siteName.equals("Reddit")) {
                fineSum = fineSum + 50;
            }
        }
        if (isNotEnough) {
            System.out.println("You have lost your salary.");
        }
        else {
            System.out.println(Math.abs(salary - fineSum));
        }
    }
}