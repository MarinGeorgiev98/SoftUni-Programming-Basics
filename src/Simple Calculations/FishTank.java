import java.util.Scanner;
public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int depth = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());
        int tankVolume = depth * width * height;
        double tankliter = tankVolume * 0.001;
        double percentConvert = percent * 0.01;
        double literFinal = tankliter *(1 - percentConvert);
        System.out.printf("%.3f", literFinal);
    }
}
