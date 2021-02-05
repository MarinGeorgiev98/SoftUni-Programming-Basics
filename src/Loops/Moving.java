import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int homeVolume = width * length * height;
        int boxesVolume = 0;
        String input = scan.nextLine();
        while (!"Done".equals(input)) {
            int boxesNumber = Integer.parseInt(input);
            boxesVolume = boxesNumber + boxesVolume;
            if (homeVolume <= boxesVolume) {
                break;
            }
            input = scan.nextLine();
        }
        if (boxesVolume >= homeVolume) {
            System.out.printf("No more free space! You need %d Cubic meters more.", boxesVolume - homeVolume);
        }
        else {
            System.out.printf("%d Cubic meters left.", homeVolume - boxesVolume);
        }
    }
}