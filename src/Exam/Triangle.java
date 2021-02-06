import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int row = 1; row <= n ; row++) {
                for (int j = 0; j < row; j++) {
                    System.out.print(row + " ");
                }
            System.out.println();
        }
    }
}