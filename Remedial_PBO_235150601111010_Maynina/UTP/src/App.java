import java.util.Scanner;

public class App {
    private static Cinema cinema = new Cinema("UTP A Cinema", 20);
    private static User currentUser = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            if (currentUser == null) {
                showAuthMenu();
            } else {
                showMainMenu();
            }
        }
    }

    private static void showAuthMenu() {
        System.out.println("Welcome to UTP A Cinema!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Pick your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // consume newline

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            case 3:
                System.exit(0);
        }
    }

    private static void login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        User user = cinema.authenticateUser(email, password);
        if (user != null) {
            currentUser = user;
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid email or password.");
        }
    }

    private static void register() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();  // consume newline

        User user = new User(email, password, fullName);
        user.topUp(initialBalance);

        if (cinema.registerUser(user)) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed.");
        }
    }

    private static void showMainMenu() {
        System.out.println("Welcome " + currentUser.getFullName() + "!");
        System.out.println("1. Dashboard");
        System.out.println("2. Top Up Balance");
        System.out.println("3. List Studios");
        System.out.println("4. Studio Details");
        System.out.println("5. Book Ticket");
        System.out.println("6. My Tickets");
        System.out.println("0. Logout");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // consume newline

        switch (choice) {
            case 1:
                showDashboard();
                break;
            case 2:
                topUpBalance();
                break;
            case 3:
                listStudios();
                break;
            case 4:
                studioDetails();
                break;
            case 5:
                bookTicket();
                break;
            case 6:
                showMyTickets();
                break;
            case 0:
                currentUser = null;
                break;
        }
    }

    private static void showDashboard() {
        System.out.println("===== Dashboard =====");
        System.out.println("Name: " + currentUser.getFullName());
        System.out.println("Email: " + currentUser.getEmail());
        System.out.println("Balance: " + currentUser.getBalance());
        System.out.println("=====================");
    }

    private static void topUpBalance() {
        System.out.print("Enter amount to top up: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // consume newline
        currentUser.topUp(amount);
        System.out.println("Top up successful! New balance: " + currentUser.getBalance());
    }

    private static void listStudios() {
        cinema.displayListStudios();
    }

    private static void studioDetails() {
        System.out.print("Enter studio number: ");
        int studioNumber = scanner.nextInt();
        scanner.nextLine();  // consume newline
        cinema.displayStudioDetail(studioNumber);
    }

    private static void bookTicket() {
        System.out.print("Enter studio number: ");
        int studioNumber = scanner.nextInt();
        System.out.print("Enter row number: ");
        int row = scanner.nextInt();
        System.out.print("Enter column number: ");
        int col = scanner.nextInt();
        scanner.nextLine();  // consume newline

        if (cinema.bookTicket(currentUser, studioNumber, row, col)) {
            System.out.println("Ticket booking successful!");
        } else {
            System.out.println("Ticket booking failed.");
        }
    }

    private static void showMyTickets() {
        currentUser.displayAllTickets();
    }
}
