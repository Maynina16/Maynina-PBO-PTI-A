import java.util.ArrayList;

public class User {
    private String email;
    private String password;
    private String fullName;
    private double balance;
    private ArrayList<Ticket> ticketsList;
    public static final int MAX_TICKET = 20;

    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = 0;
        this.ticketsList = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket) {
        if (ticketsList.size() < MAX_TICKET && balance >= ticket.getPrice()) {
            ticketsList.add(ticket);
            balance -= ticket.getPrice();
            return true;
        }
        return false;
    }

    public void displayAllTickets() {
        if (ticketsList.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            for (Ticket ticket : ticketsList) {
                System.out.println("Movie: " + ticket.getMovie().getTitle() + ", Studio: " + ticket.getStudioNumber() + ", Price: " + ticket.getPrice());
            }
        }
    }

    public boolean isMatch(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void topUp(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
