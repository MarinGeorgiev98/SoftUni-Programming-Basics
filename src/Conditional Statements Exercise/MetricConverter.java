import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        String text = scan.nextLine();
        String text2 = scan.nextLine();
        if ("mm".equals(text)) {
            number = number / 1000;
        }
        else if ("cm".equals(text)) {
            number = number / 100;
        }
        if ("mm".equals(text2)) {
            number = number * 1000;
        }
        else if ("cm".equals(text2)) {
            number = number * 100;
        }
        System.out.printf("%.3f", number);
    }
}