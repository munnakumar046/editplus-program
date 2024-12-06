import java.util.Scanner;

public class ValentineSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Valentine Search!");

        // Step 1: Select Girl and Propose
        System.out.print("Have you selected the girl you like and proposed? (yes/no): ");
        String girlSelected = scanner.nextLine().toLowerCase();

        if (girlSelected.equals("yes")) {
            // Step 2: Check her reply
            System.out.print("Did she accept your proposal? (yes/no): ");
            String reply = scanner.nextLine().toLowerCase();

            if (reply.equals("yes")) {
                System.out.println("You are now dating and chatting with her!");

                // Step 3: Check if the relationship is going well
                System.out.print("Is the relationship going well? (yes/no): ");
                String relationshipStatus = scanner.nextLine().toLowerCase();

                if (relationshipStatus.equals("yes")) {
                    System.out.println("You got married! Congratulations!");
                } else {
                    System.out.println("Depression... Breakup.");
                    System.out.println("Happy to be free again!");
                }
            } else {
                System.out.println("Valentine Search ended.");
                System.out.println("Better luck next time!");
            }
        } else {
            System.out.println("Valentine Search ended.");
            System.out.println("Maybe try again next year!");
        }

        scanner.close();
    }
}
