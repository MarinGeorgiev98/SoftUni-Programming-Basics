import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int counterI = 0;
        int counterJ = 0;
        int counter = 0;
        int counterIsMagic = 0;
        boolean isItMagic = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNum) {
                    isItMagic = true;
                    counterI = i;
                    counterJ = j;
                    counterIsMagic = counter;
                    break;
                }
            }
            if (isItMagic) {
                break;
            }
        }
        if (isItMagic) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counterIsMagic, counterI,
                    counterJ, magicNum);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}