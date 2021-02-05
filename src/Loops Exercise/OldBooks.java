import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String book = scan.nextLine();
        int capacity = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean isnextBookTheSame = false;
        while (!isnextBookTheSame) {
            String nextBook = scan.nextLine();
            if (book.equals(nextBook)) {
                isnextBookTheSame = true;
                break;
            }
            counter++;
            if (counter == capacity) {
                break;
            }
        }
        if (!isnextBookTheSame) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", counter);
        }
        else {
            System.out.printf("You checked %d books and found it.", counter);
        }
    }
}