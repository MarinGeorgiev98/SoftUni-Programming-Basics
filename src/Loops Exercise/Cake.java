import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int pieceCount = length * width;
        boolean noMorePieces = false;
        while (true) {
            String input = scan.nextLine();
            if (input.equals("STOP")) {
                noMorePieces = false;
                break;
            }
            int pieces = Integer.parseInt(input);
            pieceCount = pieceCount - pieces;
            if (pieceCount < 0) {
                noMorePieces = true;
                break;
            }
        }
        if (noMorePieces) {
            System.out.printf("No more cake left! You need %d pieces more.", pieceCount * -1);
        }
        else {
            System.out.printf("%d pieces are left.", pieceCount);
        }
    }
}