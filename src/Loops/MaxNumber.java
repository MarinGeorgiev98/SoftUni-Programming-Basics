import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        while (n > 0) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > maxNum)
                maxNum = num;
            n--;
        }
        System.out.println(maxNum);
    }
}