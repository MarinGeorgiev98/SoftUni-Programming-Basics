import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        if (town.equals("Sofia"))
        {
            if (product.equals("coffee"))
            {
                System.out.println();
            }
            else if (product.equals("water")) {
            }
        }
            else if (town.equals("Plovdiv")) {

            } else if (town.equals("Varna")) {

            }
        }
    }