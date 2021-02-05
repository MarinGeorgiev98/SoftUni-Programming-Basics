import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stepsCounter = 0;
        while (stepsCounter < 10000) {
            String input = scan.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                stepsCounter = stepsCounter + stepsToHome;
                break;
            }
            int steps = Integer.parseInt(input);
            stepsCounter = steps + stepsCounter;
        }
        if (stepsCounter >= 10000) {
            System.out.println("Goal reached! Good job!");
        }
        else {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsCounter);
        }
    }
}