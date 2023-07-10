import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] seats = new int[10];
        int choice = 0;

        while (choice != 3) {
            System.out.println("1. Reserve a seat");
            System.out.println("2. View available seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter seat number (1-10): ");
                    int seatNumber = sc.nextInt();

                    if (seatNumber < 1 || seatNumber > 10) {
                        System.out.println("Invalid seat number.");
                    } else if (seats[seatNumber - 1] == 1) {
                        System.out.println("Seat already reserved.");
                    } else {
                        seats[seatNumber - 1] = 1;
                        System.out.println("Seat reserved.");
                    }

                    break;
                case 2:
                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i] == 0) {
                            System.out.println("Seat " + (i + 1) + " is available.");
                        } else {
                            System.out.println("Seat " + (i + 1) + " is not available.");
                        }
                    }

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
