import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        int freeSeats = Integer.parseInt(scan.nextLine());
        double ticketsNum = 0;
        int studentTicket = 0;
        int standardTicket = 0;
        int kidTicket = 0;
        boolean flag = false;

        while (!movieName.equals("Finish")) {
            String ticket = scan.nextLine();
            double filmTickets = 0;
            while (!ticket.equals("End")) {
                if (filmTickets > freeSeats) {
                    break;
                }
                if (ticket.equals("student")) {
                    studentTicket++;
                }
                else if (ticket.equals("standard")) {
                    standardTicket++;
                }
                else if (ticket.equals("kid")) {
                    kidTicket++;
                }
                ticketsNum++;
                filmTickets++;
                ticket = scan.nextLine();
                if (ticket.equals("Finish")) {
                    flag = true;
                    break;
                }
            }
            double percentage = filmTickets / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.", movieName, percentage);
            System.out.println();
            filmTickets = 0;
            if (flag) {
                break;
            }
            movieName = scan.nextLine();
            freeSeats = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("Total tickets: %.0f%n", ticketsNum);
        System.out.printf("%.2f%% student tickets.%n", studentTicket / ticketsNum * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTicket / ticketsNum * 100);
        System.out.printf("%.2f%% kids tickets.%n", kidTicket / ticketsNum * 100);
    }
}